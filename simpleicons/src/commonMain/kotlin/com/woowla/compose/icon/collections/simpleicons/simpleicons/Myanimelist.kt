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

public val Simpleicons.Myanimelist: ImageVector
    get() {
        if (_myanimelist != null) {
            return _myanimelist!!
        }
        _myanimelist = Builder(name = "Myanimelist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.45f, 15.91f)
                lineTo(6.067f, 15.91f)
                verticalLineToRelative(-5.506f)
                horizontalLineToRelative(-0.028f)
                lineToRelative(-1.833f, 2.454f)
                lineToRelative(-1.796f, -2.454f)
                lineTo(2.39f, 10.404f)
                verticalLineToRelative(5.507f)
                lineTo(0.0f, 15.911f)
                lineTo(0.0f, 6.808f)
                horizontalLineToRelative(2.263f)
                lineToRelative(1.943f, 2.671f)
                lineToRelative(1.98f, -2.671f)
                lineTo(8.45f, 6.808f)
                close()
                moveTo(16.949f, 15.91f)
                horizontalLineToRelative(-2.384f)
                verticalLineToRelative(-2.883f)
                lineTo(11.96f, 13.027f)
                curveToRelative(0.008f, 1.011f, 0.373f, 1.989f, 0.914f, 2.884f)
                lineToRelative(-1.942f, 1.284f)
                curveToRelative(-0.52f, -0.793f, -1.415f, -2.458f, -1.415f, -4.527f)
                curveToRelative(0.0f, -1.015f, 0.211f, -2.942f, 1.638f, -4.37f)
                arcToRelative(4.809f, 4.809f, 0.0f, false, true, 2.737f, -1.37f)
                curveToRelative(0.96f, -0.15f, 1.936f, -0.12f, 2.905f, -0.12f)
                lineToRelative(0.555f, 2.051f)
                lineTo(15.48f, 8.859f)
                curveToRelative(-0.776f, 0.0f, -1.389f, 0.113f, -1.839f, 0.337f)
                curveToRelative(-0.637f, 0.32f, -1.009f, 0.622f, -1.447f, 1.78f)
                horizontalLineToRelative(2.372f)
                verticalLineToRelative(-1.84f)
                horizontalLineToRelative(2.384f)
                close()
                moveTo(20.871f, 13.86f)
                lineTo(24.0f, 13.86f)
                lineToRelative(-0.555f, 2.05f)
                horizontalLineToRelative(-4.962f)
                lineTo(18.483f, 6.809f)
                horizontalLineToRelative(2.388f)
                close()
            }
        }
        .build()
        return _myanimelist!!
    }

private var _myanimelist: ImageVector? = null
