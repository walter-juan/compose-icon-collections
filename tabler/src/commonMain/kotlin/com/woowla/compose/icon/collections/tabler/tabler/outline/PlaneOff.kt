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

public val OutlineGroup.PlaneOff: ImageVector
    get() {
        if (_planeOff != null) {
            return _planeOff!!
        }
        _planeOff = Builder(name = "PlaneOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.788f, 5.758f)
                lineToRelative(-0.788f, -2.758f)
                horizontalLineToRelative(3.0f)
                lineToRelative(4.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                moveToRelative(-2.718f, 1.256f)
                lineToRelative(-3.282f, 5.744f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(2.0f, -7.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(2.0f, -4.0f)
                lineToRelative(-2.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _planeOff!!
    }

private var _planeOff: ImageVector? = null
