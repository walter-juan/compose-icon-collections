package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Number7Zip: ImageVector
    get() {
        if (_number7Zip != null) {
            return _number7Zip!!
        }
        _number7Zip = Builder(name = "Number7Zip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.858f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 8.181f)
                lineTo(10.717f, 8.181f)
                lineTo(10.717f, 5.142f)
                lineTo(0.0f, 5.142f)
                close()
                moveTo(2.021f, 7.271f)
                horizontalLineToRelative(6.657f)
                verticalLineToRelative(1.994f)
                curveToRelative(-1.74f, 2.09f, -2.84f, 4.502f, -2.948f, 7.404f)
                lineTo(3.477f, 16.669f)
                curveToRelative(0.09f, -2.501f, 0.353f, -4.954f, 2.283f, -6.994f)
                lineToRelative(0.033f, -0.033f)
                lineTo(2.021f, 9.642f)
                close()
                moveTo(10.471f, 8.524f)
                horizontalLineToRelative(13.215f)
                verticalLineToRelative(10.143f)
                lineTo(10.47f, 18.667f)
                close()
                moveTo(16.481f, 9.737f)
                verticalLineToRelative(6.871f)
                horizontalLineToRelative(1.482f)
                verticalLineToRelative(-6.87f)
                close()
                moveTo(19.236f, 9.78f)
                verticalLineToRelative(6.912f)
                horizontalLineToRelative(1.616f)
                verticalLineToRelative(-2.42f)
                horizontalLineToRelative(1.029f)
                curveToRelative(0.43f, -0.001f, 0.754f, -0.29f, 0.969f, -0.716f)
                curveToRelative(0.427f, -0.848f, 0.429f, -2.257f, -0.024f, -3.092f)
                curveToRelative(-0.227f, -0.419f, -0.571f, -0.697f, -1.033f, -0.684f)
                close()
                moveTo(11.312f, 9.782f)
                verticalLineToRelative(1.596f)
                horizontalLineToRelative(2.217f)
                lineToRelative(-2.304f, 3.736f)
                verticalLineToRelative(1.54f)
                horizontalLineToRelative(4.287f)
                lineTo(15.512f, 15.1f)
                horizontalLineToRelative(-2.698f)
                lineToRelative(2.786f, -3.909f)
                verticalLineToRelative(-1.41f)
                close()
                moveTo(20.764f, 11.294f)
                horizontalLineToRelative(0.595f)
                curveToRelative(0.164f, -0.006f, 0.287f, 0.081f, 0.371f, 0.217f)
                curveToRelative(0.17f, 0.273f, 0.172f, 0.736f, 0.004f, 0.99f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, -0.373f, 0.176f)
                lineToRelative(-0.55f, 0.047f)
                close()
            }
        }
        .build()
        return _number7Zip!!
    }

private var _number7Zip: ImageVector? = null
