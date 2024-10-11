package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BubbleMinus: ImageVector
    get() {
        if (_bubbleMinus != null) {
            return _bubbleMinus!!
        }
        _bubbleMinus = Builder(name = "BubbleMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.4f, 19.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.57f, -0.298f)
                lineToRelative(-3.83f, 2.298f)
                verticalLineToRelative(-3.134f)
                arcToRelative(2.668f, 2.668f, 0.0f, false, true, -1.795f, -3.773f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, 2.908f, -8.933f)
                arcToRelative(5.335f, 5.335f, 0.0f, false, true, 9.194f, 1.078f)
                arcToRelative(5.333f, 5.333f, 0.0f, false, true, 3.404f, 8.771f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _bubbleMinus!!
    }

private var _bubbleMinus: ImageVector? = null
