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

public val OutlineGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                verticalLineToRelative(-15.0f)
                lineToRelative(7.0f, 4.0f)
                lineToRelative(-7.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.67f)
                curveToRelative(-0.62f, 0.36f, -1.0f, 0.82f, -1.0f, 1.33f)
                curveToRelative(0.0f, 1.1f, 1.8f, 2.0f, 4.0f, 2.0f)
                reflectiveCurveToRelative(4.0f, -0.9f, 4.0f, -2.0f)
                curveToRelative(0.0f, -0.5f, -0.38f, -0.97f, -1.0f, -1.33f)
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
