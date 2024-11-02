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

public val Simpleicons.Camunda: ImageVector
    get() {
        if (_camunda != null) {
            return _camunda!!
        }
        _camunda = Builder(name = "Camunda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.327f, 0.0f)
                arcTo(3.327f, 3.327f, 0.0f, false, false, 0.0f, 3.326f)
                verticalLineToRelative(17.348f)
                arcTo(3.327f, 3.327f, 0.0f, false, false, 3.327f, 24.0f)
                horizontalLineToRelative(17.347f)
                arcTo(3.326f, 3.326f, 0.0f, false, false, 24.0f, 20.674f)
                lineTo(24.0f, 3.326f)
                arcTo(3.326f, 3.326f, 0.0f, false, false, 20.674f, 0.0f)
                lineTo(3.327f, 0.0f)
                close()
                moveTo(12.014f, 3.307f)
                curveToRelative(1.875f, 0.0f, 2.84f, 1.105f, 2.84f, 3.049f)
                verticalLineToRelative(1.175f)
                lineTo(13.05f, 7.531f)
                lineTo(13.05f, 6.23f)
                curveToRelative(0.0f, -0.867f, -0.392f, -1.203f, -0.994f, -1.203f)
                curveToRelative(-0.615f, -0.014f, -0.993f, 0.322f, -0.993f, 1.189f)
                verticalLineToRelative(6.56f)
                curveToRelative(0.0f, 0.867f, 0.392f, 1.175f, 0.993f, 1.175f)
                curveToRelative(0.616f, 0.0f, 0.994f, -0.308f, 0.994f, -1.175f)
                verticalLineToRelative(-1.734f)
                horizontalLineToRelative(1.804f)
                verticalLineToRelative(1.608f)
                curveToRelative(-0.014f, 1.945f, -0.979f, 3.049f, -2.854f, 3.049f)
                curveToRelative(-1.874f, 0.0f, -2.839f, -1.119f, -2.839f, -3.035f)
                lineTo(9.161f, 6.356f)
                curveToRelative(0.014f, -1.944f, 0.979f, -3.049f, 2.853f, -3.049f)
                close()
                moveTo(9.161f, 17.476f)
                horizontalLineToRelative(5.693f)
                verticalLineToRelative(3.217f)
                lineTo(9.161f, 20.693f)
                verticalLineToRelative(-3.217f)
                close()
            }
        }
        .build()
        return _camunda!!
    }

private var _camunda: ImageVector? = null
