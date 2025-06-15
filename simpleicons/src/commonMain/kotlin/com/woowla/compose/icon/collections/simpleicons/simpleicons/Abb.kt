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

public val Simpleicons.Abb: ImageVector
    get() {
        if (_abb != null) {
            return _abb!!
        }
        _abb = Builder(name = "Abb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.086f, 16.594f)
                verticalLineToRelative(-4.427f)
                horizontalLineToRelative(3.035f)
                curveToRelative(0.25f, 0.418f, 0.362f, 0.947f, 0.362f, 1.476f)
                curveToRelative(0.0f, 1.559f, -1.17f, 2.867f, -2.84f, 2.951f)
                close()
                moveTo(12.807f, 12.139f)
                verticalLineToRelative(4.455f)
                horizontalLineToRelative(-2.784f)
                verticalLineToRelative(-4.455f)
                close()
                moveTo(15.954f, 11.861f)
                horizontalLineToRelative(-2.868f)
                lineTo(13.086f, 7.406f)
                horizontalLineToRelative(0.668f)
                curveToRelative(1.086f, 0.0f, 1.949f, 0.863f, 1.949f, 1.949f)
                curveToRelative(0.0f, 0.64f, -0.334f, 1.225f, -0.835f, 1.587f)
                curveToRelative(0.417f, 0.223f, 0.807f, 0.529f, 1.086f, 0.919f)
                moveToRelative(-3.147f, -4.455f)
                verticalLineToRelative(4.455f)
                horizontalLineToRelative(-2.784f)
                lineTo(10.023f, 7.406f)
                close()
                moveTo(20.603f, 16.594f)
                verticalLineToRelative(-4.427f)
                horizontalLineToRelative(3.035f)
                curveToRelative(0.251f, 0.418f, 0.362f, 0.947f, 0.362f, 1.476f)
                curveToRelative(0.0f, 1.559f, -1.169f, 2.867f, -2.84f, 2.951f)
                close()
                moveTo(20.325f, 12.139f)
                verticalLineToRelative(4.455f)
                horizontalLineToRelative(-2.784f)
                verticalLineToRelative(-4.455f)
                close()
                moveTo(23.471f, 11.861f)
                horizontalLineToRelative(-2.868f)
                lineTo(20.603f, 7.406f)
                horizontalLineToRelative(0.668f)
                curveToRelative(1.086f, 0.0f, 1.949f, 0.863f, 1.949f, 1.949f)
                curveToRelative(0.0f, 0.64f, -0.334f, 1.225f, -0.835f, 1.587f)
                curveToRelative(0.418f, 0.223f, 0.808f, 0.529f, 1.086f, 0.919f)
                moveToRelative(-3.146f, -4.455f)
                verticalLineToRelative(4.455f)
                horizontalLineToRelative(-2.784f)
                lineTo(17.541f, 7.406f)
                close()
                moveTo(1.587f, 12.139f)
                horizontalLineToRelative(2.868f)
                verticalLineToRelative(2.506f)
                lineTo(2.979f, 14.645f)
                lineToRelative(-0.668f, 1.949f)
                lineTo(0.0f, 16.594f)
                close()
                moveTo(4.455f, 7.406f)
                verticalLineToRelative(4.455f)
                lineTo(1.671f, 11.861f)
                lineToRelative(1.587f, -4.455f)
                close()
                moveTo(4.733f, 14.645f)
                verticalLineToRelative(-2.506f)
                horizontalLineToRelative(2.868f)
                lineToRelative(1.587f, 4.455f)
                lineTo(6.877f, 16.594f)
                lineToRelative(-0.668f, -1.949f)
                close()
                moveTo(7.517f, 11.861f)
                lineTo(4.733f, 11.861f)
                lineTo(4.733f, 7.406f)
                lineTo(5.93f, 7.406f)
                close()
            }
        }
        .build()
        return _abb!!
    }

private var _abb: ImageVector? = null
