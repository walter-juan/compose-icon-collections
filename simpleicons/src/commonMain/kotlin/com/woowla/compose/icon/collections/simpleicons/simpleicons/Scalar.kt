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

public val Simpleicons.Scalar: ImageVector
    get() {
        if (_scalar != null) {
            return _scalar!!
        }
        _scalar = Builder(name = "Scalar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.044f, 0.0f)
                curveToRelative(0.243f, 0.0f, 0.486f, 0.202f, 0.486f, 0.486f)
                verticalLineToRelative(5.423f)
                lineToRelative(3.804f, -3.845f)
                curveToRelative(0.202f, -0.202f, 0.526f, -0.202f, 0.688f, 0.0f)
                lineToRelative(2.914f, 2.914f)
                curveToRelative(0.162f, 0.162f, 0.202f, 0.486f, 0.0f, 0.648f)
                verticalLineToRelative(0.04f)
                lineTo(18.09f, 9.47f)
                horizontalLineToRelative(5.423f)
                curveToRelative(0.284f, 0.0f, 0.486f, 0.203f, 0.486f, 0.486f)
                verticalLineToRelative(4.088f)
                arcToRelative(0.468f, 0.468f, 0.0f, false, true, -0.486f, 0.486f)
                horizontalLineToRelative(-5.423f)
                lineToRelative(3.845f, 3.804f)
                curveToRelative(0.162f, 0.202f, 0.202f, 0.526f, 0.0f, 0.688f)
                lineToRelative(-2.914f, 2.914f)
                curveToRelative(-0.162f, 0.162f, -0.486f, 0.202f, -0.648f, 0.0f)
                horizontalLineToRelative(-0.04f)
                lineTo(14.53f, 18.09f)
                verticalLineToRelative(5.423f)
                arcToRelative(0.468f, 0.468f, 0.0f, false, true, -0.486f, 0.486f)
                horizontalLineTo(9.956f)
                arcToRelative(0.468f, 0.468f, 0.0f, false, true, -0.486f, -0.486f)
                verticalLineToRelative(-2.833f)
                curveToRelative(0.0f, -0.89f, 0.365f, -1.74f, 0.972f, -2.388f)
                lineToRelative(5.261f, -5.261f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, false, 0.0f, -2.064f)
                lineToRelative(-5.22f, -5.221f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 9.47f, 3.359f)
                verticalLineTo(0.486f)
                curveToRelative(0.0f, -0.284f, 0.203f, -0.486f, 0.486f, -0.486f)
                horizontalLineToRelative(4.088f)
                close()
                moveTo(5.585f, 2.105f)
                horizontalLineToRelative(0.04f)
                lineToRelative(8.864f, 8.863f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, true, 0.0f, 2.064f)
                lineToRelative(-8.863f, 8.904f)
                curveToRelative(-0.162f, 0.202f, -0.486f, 0.202f, -0.688f, 0.0f)
                lineToRelative(-2.874f, -2.833f)
                curveToRelative(-0.162f, -0.203f, -0.202f, -0.486f, 0.0f, -0.688f)
                lineTo(5.91f, 14.53f)
                horizontalLineTo(0.486f)
                arcTo(0.468f, 0.468f, 0.0f, false, true, 0.0f, 14.043f)
                verticalLineTo(9.956f)
                curveToRelative(0.0f, -0.283f, 0.202f, -0.486f, 0.486f, -0.486f)
                horizontalLineToRelative(5.423f)
                lineTo(2.064f, 5.666f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.0f, -0.688f)
                lineToRelative(2.874f, -2.873f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, true, 0.647f, 0.0f)
                close()
            }
        }
        .build()
        return _scalar!!
    }

private var _scalar: ImageVector? = null
