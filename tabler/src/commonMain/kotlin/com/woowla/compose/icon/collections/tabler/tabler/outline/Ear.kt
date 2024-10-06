package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 13.0f, 3.6f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, 3.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -6.8f, 1.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 5.0f, 2.2f)
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
