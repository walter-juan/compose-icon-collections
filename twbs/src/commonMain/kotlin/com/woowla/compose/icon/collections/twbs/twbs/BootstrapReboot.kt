package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BootstrapReboot: ImageVector
    get() {
        if (_bootstrapReboot != null) {
            return _bootstrapReboot!!
        }
        _bootstrapReboot = Builder(name = "BootstrapReboot", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.161f, 8.0f)
                arcToRelative(6.84f, 6.84f, 0.0f, true, false, 6.842f, -6.84f)
                arcToRelative(0.58f, 0.58f, 0.0f, true, true, 0.0f, -1.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -6.556f, 3.412f)
                lineToRelative(-0.663f, -0.577f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.227f, -0.997f)
                lineToRelative(2.52f, -0.69f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.728f, 0.633f)
                lineToRelative(-0.332f, 2.592f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, -0.956f, 0.364f)
                lineToRelative(-0.643f, -0.56f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 1.16f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.641f, 11.671f)
                lineTo(6.641f, 8.843f)
                horizontalLineToRelative(1.57f)
                lineToRelative(1.498f, 2.828f)
                horizontalLineToRelative(1.314f)
                lineTo(9.377f, 8.665f)
                curveToRelative(0.897f, -0.3f, 1.427f, -1.106f, 1.427f, -2.1f)
                curveToRelative(0.0f, -1.37f, -0.943f, -2.246f, -2.456f, -2.246f)
                lineTo(5.5f, 4.319f)
                verticalLineToRelative(7.352f)
                close()
                moveTo(6.641f, 7.921f)
                lineTo(6.641f, 5.277f)
                horizontalLineToRelative(1.57f)
                curveToRelative(0.881f, 0.0f, 1.416f, 0.499f, 1.416f, 1.32f)
                curveToRelative(0.0f, 0.84f, -0.504f, 1.324f, -1.386f, 1.324f)
                close()
            }
        }
        .build()
        return _bootstrapReboot!!
    }

private var _bootstrapReboot: ImageVector? = null
