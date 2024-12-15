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

public val Simpleicons.Keeper: ImageVector
    get() {
        if (_keeper != null) {
            return _keeper!!
        }
        _keeper = Builder(name = "Keeper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.365f, 1.788f)
                lineTo(15.219f, 2.26f)
                verticalLineToRelative(2.597f)
                lineToRelative(2.073f, -1.704f)
                lineToRelative(1.537f, 1.135f)
                lineToRelative(-3.949f, 3.247f)
                lineToRelative(-1.515f, -0.008f)
                close()
                moveTo(4.298f, 17.328f)
                lineTo(2.445f, 15.75f)
                lineTo(2.445f, 8.7f)
                lineTo(4.298f, 7.0f)
                close()
                moveTo(7.929f, 19.548f)
                lineTo(6.076f, 21.16f)
                lineTo(6.076f, 3.0f)
                lineToRelative(1.853f, 1.614f)
                close()
                moveTo(17.292f, 21.103f)
                lineTo(15.219f, 19.398f)
                verticalLineToRelative(2.597f)
                lineToRelative(-1.854f, 0.473f)
                verticalLineToRelative(-5.74f)
                lineToRelative(1.515f, -0.007f)
                lineToRelative(3.95f, 3.246f)
                close()
                moveTo(20.025f, 18.63f)
                lineTo(15.421f, 14.956f)
                horizontalLineToRelative(-3.826f)
                verticalLineToRelative(7.512f)
                lineTo(9.742f, 22.468f)
                verticalLineToRelative(-9.365f)
                horizontalLineToRelative(6.329f)
                lineToRelative(5.11f, 4.078f)
                close()
                moveTo(22.645f, 10.301f)
                lineTo(20.586f, 12.001f)
                lineTo(22.645f, 13.699f)
                lineTo(21.464f, 15.13f)
                lineTo(17.67f, 12.0f)
                lineToRelative(3.793f, -3.13f)
                close()
                moveTo(16.071f, 10.901f)
                lineTo(9.742f, 10.901f)
                lineTo(9.742f, 1.534f)
                horizontalLineToRelative(1.853f)
                verticalLineToRelative(7.512f)
                horizontalLineToRelative(3.826f)
                lineToRelative(4.604f, -3.674f)
                lineToRelative(1.156f, 1.449f)
                close()
            }
        }
        .build()
        return _keeper!!
    }

private var _keeper: ImageVector? = null
