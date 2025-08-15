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

public val Simpleicons.Blibli: ImageVector
    get() {
        if (_blibli != null) {
            return _blibli!!
        }
        _blibli = Builder(name = "Blibli", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.802f, 5.946f)
                curveToRelative(2.479f, 0.254f, 4.323f, 0.381f, 6.166f, 0.381f)
                lineToRelative(-0.89f, -2.924f)
                arcToRelative(1.017f, 1.017f, 0.0f, false, false, -1.271f, -0.636f)
                lineToRelative(-3.624f, 0.954f)
                curveToRelative(-0.572f, 0.127f, -0.89f, 0.763f, -0.636f, 1.271f)
                lineToRelative(0.191f, 0.89f)
                close()
                moveTo(18.325f, 5.946f)
                lineTo(18.325f, 3.911f)
                curveToRelative(0.064f, -0.636f, -0.636f, -1.081f, -1.271f, -0.699f)
                lineToRelative(-3.687f, 2.416f)
                curveToRelative(-0.254f, 0.127f, -0.445f, 0.381f, -0.509f, 0.636f)
                curveToRelative(1.526f, 0.0f, 3.178f, -0.127f, 5.467f, -0.318f)
                close()
                moveTo(14.002f, 3.911f)
                arcToRelative(1.971f, 1.971f, 0.0f, true, false, -0.954f, -3.814f)
                arcToRelative(1.971f, 1.971f, 0.0f, true, false, 0.954f, 3.814f)
                close()
                moveTo(19.152f, 6.518f)
                verticalLineToRelative(0.063f)
                horizontalLineToRelative(-0.127f)
                curveToRelative(-3.051f, 0.318f, -5.086f, 0.444f, -6.993f, 0.444f)
                curveToRelative(-2.034f, 0.0f, -4.006f, -0.127f, -7.121f, -0.444f)
                horizontalLineToRelative(-0.063f)
                curveToRelative(-0.636f, 0.0f, -1.017f, 0.381f, -0.954f, 1.017f)
                curveToRelative(1.017f, 6.039f, 1.017f, 9.79f, -0.509f, 15.194f)
                curveTo(3.195f, 23.364f, 3.703f, 24.0f, 4.339f, 24.0f)
                lineTo(19.724f, 24.0f)
                curveToRelative(0.572f, 0.0f, 1.081f, -0.573f, 0.89f, -1.145f)
                arcToRelative(30.132f, 30.132f, 0.0f, false, true, -0.509f, -15.257f)
                curveToRelative(0.127f, -0.572f, -0.318f, -1.08f, -0.954f, -1.08f)
                close()
                moveTo(8.854f, 10.141f)
                curveToRelative(0.445f, 0.0f, 0.762f, 0.318f, 0.762f, 0.636f)
                verticalLineToRelative(0.063f)
                curveToRelative(0.0f, 0.381f, -0.317f, 0.7f, -0.762f, 0.7f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, -0.636f, -0.7f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, 0.636f, -0.699f)
                close()
                moveTo(15.083f, 10.141f)
                curveToRelative(0.382f, 0.0f, 0.764f, 0.318f, 0.764f, 0.699f)
                curveToRelative(0.0f, 0.381f, -0.382f, 0.7f, -0.764f, 0.7f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, -0.636f, -0.764f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, 0.636f, -0.636f)
                close()
                moveTo(8.471f, 12.747f)
                curveToRelative(0.318f, 0.0f, 0.509f, 0.255f, 0.509f, 0.509f)
                arcToRelative(2.924f, 2.924f, 0.0f, false, false, 2.987f, 2.924f)
                curveToRelative(2.289f, 0.0f, 3.052f, -1.97f, 3.052f, -2.924f)
                curveToRelative(0.0f, -0.254f, 0.19f, -0.509f, 0.444f, -0.509f)
                reflectiveCurveToRelative(0.509f, 0.255f, 0.509f, 0.509f)
                curveToRelative(0.0f, 1.271f, -0.954f, 3.814f, -4.005f, 3.814f)
                curveToRelative(-2.988f, 0.0f, -3.941f, -2.543f, -3.941f, -3.814f)
                curveToRelative(0.0f, -0.254f, 0.19f, -0.509f, 0.444f, -0.509f)
                close()
            }
        }
        .build()
        return _blibli!!
    }

private var _blibli: ImageVector? = null
