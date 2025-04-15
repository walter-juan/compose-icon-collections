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

public val Simpleicons.H2database: ImageVector
    get() {
        if (_h2database != null) {
            return _h2database!!
        }
        _h2database = Builder(name = "H2database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.17f, 13.27f)
                curveToRelative(0.14f, -0.015f, 0.28f, -0.023f, 0.416f, -0.023f)
                curveToRelative(0.7f, 0.0f, 1.228f, 0.159f, 1.599f, 0.469f)
                curveToRelative(0.37f, 0.314f, 0.555f, 0.756f, 0.555f, 1.334f)
                arcToRelative(2.861f, 2.861f, 0.0f, false, true, -0.43f, 1.455f)
                curveToRelative(-0.291f, 0.492f, -0.775f, 1.066f, -1.46f, 1.727f)
                curveToRelative(-0.453f, 0.446f, -1.061f, 0.976f, -1.821f, 1.592f)
                arcToRelative(48.02f, 48.02f, 0.0f, false, true, -2.275f, 1.742f)
                verticalLineToRelative(2.083f)
                horizontalLineToRelative(9.895f)
                verticalLineTo(21.24f)
                horizontalLineTo(17.99f)
                curveToRelative(0.219f, -0.159f, 0.59f, -0.435f, 1.11f, -0.832f)
                curveToRelative(0.519f, -0.4f, 1.033f, -0.835f, 1.55f, -1.311f)
                curveToRelative(0.817f, -0.76f, 1.425f, -1.5f, 1.822f, -2.215f)
                arcToRelative(4.624f, 4.624f, 0.0f, false, false, 0.597f, -2.268f)
                curveToRelative(0.0f, -1.213f, -0.416f, -2.154f, -1.247f, -2.815f)
                curveToRelative(-0.828f, -0.662f, -2.033f, -0.994f, -3.613f, -0.994f)
                curveToRelative(-0.344f, 0.0f, -0.692f, 0.015f, -1.036f, 0.049f)
                verticalLineTo(6.04f)
                horizontalLineTo(13.86f)
                verticalLineToRelative(4.701f)
                horizontalLineTo(8.965f)
                verticalLineTo(6.04f)
                horizontalLineTo(5.65f)
                verticalLineToRelative(12.846f)
                horizontalLineToRelative(3.315f)
                verticalLineToRelative(-5.661f)
                horizontalLineToRelative(4.89f)
                verticalLineToRelative(5.661f)
                horizontalLineToRelative(0.039f)
                curveToRelative(0.31f, -0.242f, 0.623f, -0.487f, 0.933f, -0.74f)
                arcToRelative(28.564f, 28.564f, 0.0f, false, false, 1.826f, -1.588f)
                arcToRelative(14.854f, 14.854f, 0.0f, false, false, 0.517f, -0.529f)
                close()
                moveTo(12.011f, 23.3f)
                arcTo(11.327f, 11.327f, 0.0f, false, true, 0.7f, 11.99f)
                arcTo(11.305f, 11.305f, 0.0f, false, true, 12.011f, 0.699f)
                arcToRelative(11.286f, 11.286f, 0.0f, false, true, 11.29f, 11.29f)
                verticalLineToRelative(0.351f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-0.351f)
                arcTo(11.985f, 11.985f, 0.0f, false, false, 12.011f, 0.0f)
                arcTo(12.008f, 12.008f, 0.0f, false, false, 0.0f, 11.989f)
                arcTo(12.026f, 12.026f, 0.0f, false, false, 12.011f, 24.0f)
                horizontalLineToRelative(0.352f)
                verticalLineToRelative(-0.7f)
                close()
            }
        }
        .build()
        return _h2database!!
    }

private var _h2database: ImageVector? = null
