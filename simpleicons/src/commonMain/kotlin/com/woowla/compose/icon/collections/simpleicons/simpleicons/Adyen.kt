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

public val Simpleicons.Adyen: ImageVector
    get() {
        if (_adyen != null) {
            return _adyen!!
        }
        _adyen = Builder(name = "Adyen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.647f, 9.882f)
                verticalLineToRelative(2.934f)
                curveToRelative(0.0f, 0.134f, 0.109f, 0.243f, 0.243f, 0.243f)
                horizontalLineToRelative(0.463f)
                lineTo(12.353f, 9.882f)
                horizontalLineToRelative(1.765f)
                verticalLineToRelative(5.15f)
                curveToRelative(0.0f, 0.469f, -0.38f, 0.85f, -0.85f, 0.85f)
                lineTo(9.943f, 15.882f)
                verticalLineToRelative(-1.235f)
                horizontalLineToRelative(2.41f)
                verticalLineToRelative(-0.529f)
                horizontalLineToRelative(-1.621f)
                curveToRelative(-0.469f, 0.0f, -0.85f, -0.38f, -0.85f, -0.85f)
                lineTo(9.882f, 9.882f)
                horizontalLineToRelative(1.765f)
                close()
                moveTo(3.386f, 9.882f)
                curveToRelative(0.469f, 0.0f, 0.85f, 0.38f, 0.85f, 0.85f)
                verticalLineToRelative(3.386f)
                lineTo(0.85f, 14.118f)
                curveToRelative(-0.469f, 0.0f, -0.85f, -0.38f, -0.85f, -0.85f)
                verticalLineToRelative(-0.948f)
                curveToRelative(0.0f, -0.469f, 0.38f, -0.85f, 0.85f, -0.85f)
                horizontalLineToRelative(0.915f)
                verticalLineToRelative(1.345f)
                curveToRelative(0.0f, 0.134f, 0.109f, 0.243f, 0.243f, 0.243f)
                horizontalLineToRelative(0.463f)
                lineTo(2.471f, 11.184f)
                curveToRelative(0.0f, -0.134f, -0.109f, -0.243f, -0.243f, -0.243f)
                lineToRelative(-2.167f, -0.0f)
                lineTo(0.061f, 9.882f)
                close()
                moveTo(9.176f, 8.118f)
                verticalLineToRelative(6.0f)
                lineTo(5.791f, 14.118f)
                curveToRelative(-0.469f, 0.0f, -0.85f, -0.38f, -0.85f, -0.85f)
                verticalLineToRelative(-2.536f)
                curveToRelative(0.0f, -0.469f, 0.38f, -0.85f, 0.85f, -0.85f)
                horizontalLineToRelative(0.915f)
                verticalLineToRelative(2.934f)
                curveToRelative(0.0f, 0.134f, 0.109f, 0.243f, 0.243f, 0.243f)
                horizontalLineToRelative(0.463f)
                lineToRelative(0.0f, -4.941f)
                horizontalLineToRelative(1.765f)
                close()
                moveTo(18.209f, 9.882f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, 0.85f, 0.85f)
                verticalLineToRelative(0.948f)
                curveToRelative(0.0f, 0.469f, -0.38f, 0.85f, -0.85f, 0.85f)
                horizontalLineToRelative(-0.915f)
                verticalLineToRelative(-1.345f)
                curveToRelative(0.0f, -0.134f, -0.109f, -0.243f, -0.243f, -0.243f)
                horizontalLineToRelative(-0.463f)
                verticalLineToRelative(1.875f)
                curveToRelative(0.0f, 0.134f, 0.109f, 0.243f, 0.243f, 0.243f)
                horizontalLineToRelative(2.167f)
                verticalLineToRelative(1.059f)
                horizontalLineToRelative(-3.325f)
                curveToRelative(-0.469f, 0.0f, -0.85f, -0.38f, -0.85f, -0.85f)
                verticalLineToRelative(-3.386f)
                close()
                moveTo(23.15f, 9.882f)
                curveToRelative(0.469f, 0.0f, 0.85f, 0.38f, 0.85f, 0.85f)
                verticalLineToRelative(3.386f)
                horizontalLineToRelative(-1.765f)
                lineTo(22.235f, 11.184f)
                curveToRelative(-0.0f, -0.134f, -0.109f, -0.242f, -0.243f, -0.243f)
                horizontalLineToRelative(-0.463f)
                verticalLineToRelative(3.177f)
                lineTo(19.765f, 14.118f)
                lineTo(19.765f, 9.882f)
                close()
            }
        }
        .build()
        return _adyen!!
    }

private var _adyen: ImageVector? = null
