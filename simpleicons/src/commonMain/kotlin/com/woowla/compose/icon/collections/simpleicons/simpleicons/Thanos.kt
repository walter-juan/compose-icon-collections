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

public val Simpleicons.Thanos: ImageVector
    get() {
        if (_thanos != null) {
            return _thanos!!
        }
        _thanos = Builder(name = "Thanos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(16.998f)
                arcTo(7.002f, 7.002f, 0.0f, false, false, 24.0f, 16.998f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(18.707f, 15.129f)
                horizontalLineToRelative(0.896f)
                verticalLineToRelative(0.895f)
                horizontalLineToRelative(-0.896f)
                close()
                moveTo(18.426f, 11.272f)
                horizontalLineToRelative(1.455f)
                verticalLineToRelative(1.456f)
                horizontalLineToRelative(-1.455f)
                close()
                moveTo(18.202f, 7.471f)
                horizontalLineToRelative(1.903f)
                verticalLineToRelative(1.905f)
                horizontalLineToRelative(-1.903f)
                close()
                moveTo(15.129f, 18.705f)
                horizontalLineToRelative(0.895f)
                verticalLineToRelative(0.896f)
                horizontalLineToRelative(-0.896f)
                close()
                moveTo(14.849f, 14.803f)
                horizontalLineToRelative(1.456f)
                verticalLineToRelative(1.457f)
                horizontalLineToRelative(-1.456f)
                close()
                moveTo(14.625f, 11.048f)
                horizontalLineToRelative(1.906f)
                verticalLineToRelative(1.904f)
                horizontalLineToRelative(-1.904f)
                close()
                moveTo(14.849f, 9.151f)
                lineTo(14.849f, 7.696f)
                horizontalLineToRelative(1.456f)
                lineTo(16.305f, 9.15f)
                close()
                moveTo(7.975f, 18.705f)
                horizontalLineToRelative(0.896f)
                verticalLineToRelative(0.896f)
                horizontalLineToRelative(-0.896f)
                close()
                moveTo(7.695f, 14.849f)
                horizontalLineToRelative(1.456f)
                verticalLineToRelative(1.454f)
                lineTo(7.695f, 16.303f)
                close()
                moveTo(7.975f, 12.448f)
                verticalLineToRelative(-0.896f)
                horizontalLineToRelative(0.896f)
                verticalLineToRelative(0.896f)
                close()
                moveTo(7.695f, 7.696f)
                horizontalLineToRelative(1.456f)
                lineTo(9.151f, 9.15f)
                lineTo(7.695f, 9.15f)
                close()
                moveTo(4.4f, 18.706f)
                horizontalLineToRelative(0.897f)
                verticalLineToRelative(0.895f)
                horizontalLineToRelative(-0.897f)
                close()
                moveTo(4.4f, 15.129f)
                horizontalLineToRelative(0.897f)
                verticalLineToRelative(0.895f)
                horizontalLineToRelative(-0.897f)
                close()
                moveTo(4.12f, 11.272f)
                horizontalLineToRelative(1.455f)
                verticalLineToRelative(1.456f)
                lineTo(4.12f, 12.728f)
                close()
                moveTo(3.896f, 7.471f)
                horizontalLineToRelative(1.904f)
                verticalLineToRelative(1.905f)
                lineTo(3.895f, 9.376f)
                close()
                moveTo(3.059f, 3.058f)
                lineTo(20.94f, 3.058f)
                verticalLineToRelative(3.577f)
                horizontalLineToRelative(-7.153f)
                verticalLineToRelative(14.307f)
                horizontalLineToRelative(-3.576f)
                lineTo(10.211f, 6.635f)
                lineTo(3.058f, 6.635f)
                close()
            }
        }
        .build()
        return _thanos!!
    }

private var _thanos: ImageVector? = null
