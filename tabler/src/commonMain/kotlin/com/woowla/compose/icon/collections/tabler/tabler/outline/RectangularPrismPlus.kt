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

public val OutlineGroup.RectangularPrismPlus: ImageVector
    get() {
        if (_rectangularPrismPlus != null) {
            return _rectangularPrismPlus!!
        }
        _rectangularPrismPlus = Builder(name = "RectangularPrismPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.5f)
                verticalLineToRelative(-3.509f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -1.0f, -1.717f)
                lineToRelative(-4.0f, -2.008f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, -2.0f, 0.0f)
                lineToRelative(-10.0f, 5.007f)
                curveToRelative(-0.619f, 0.355f, -1.0f, 1.01f, -1.0f, 1.718f)
                verticalLineToRelative(5.018f)
                curveToRelative(0.0f, 0.709f, 0.381f, 1.363f, 1.0f, 1.717f)
                lineToRelative(4.0f, 2.008f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, 2.0f, 0.0f)
                lineToRelative(2.062f, -1.032f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(-7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.5f)
                lineToRelative(11.5f, -5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 11.0f)
                lineToRelative(5.5f, 2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(6.0f)
            }
        }
        .build()
        return _rectangularPrismPlus!!
    }

private var _rectangularPrismPlus: ImageVector? = null
