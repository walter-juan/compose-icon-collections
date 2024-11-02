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

public val Simpleicons.Nxp: ImageVector
    get() {
        if (_nxp != null) {
            return _nxp!!
        }
        _nxp = Builder(name = "Nxp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.797f, 7.914f)
                lineToRelative(2.521f, 4.086f)
                lineToRelative(-2.521f, 4.086f)
                lineToRelative(-4.271f, -4.939f)
                lineToRelative(0.001f, 4.938f)
                lineToRelative(-2.521f, 0.001f)
                lineTo(0.0f, 16.079f)
                lineTo(0.0f, 7.914f)
                horizontalLineToRelative(2.524f)
                lineToRelative(4.271f, 4.939f)
                lineToRelative(0.0f, -4.939f)
                moveToRelative(14.851f, 2.895f)
                curveToRelative(0.0f, -0.552f, -0.273f, -0.867f, -1.037f, -0.867f)
                horizontalLineToRelative(-3.188f)
                verticalLineToRelative(2.312f)
                horizontalLineToRelative(3.405f)
                curveToRelative(0.592f, 0.0f, 0.82f, -0.558f, 0.82f, -1.042f)
                verticalLineToRelative(-0.402f)
                close()
                moveTo(21.016f, 7.914f)
                curveTo(23.419f, 7.914f, 24.0f, 9.108f, 24.0f, 10.707f)
                verticalLineToRelative(0.96f)
                curveToRelative(0.0f, 1.216f, -0.535f, 2.613f, -2.323f, 2.613f)
                horizontalLineToRelative(-4.259f)
                lineToRelative(0.001f, 1.805f)
                horizontalLineToRelative(-0.001f)
                lineTo(14.897f, 12.0f)
                lineToRelative(2.521f, -4.086f)
                horizontalLineToRelative(3.598f)
                moveToRelative(-6.746f, 0.0f)
                horizontalLineToRelative(-0.461f)
                lineToRelative(-1.702f, 2.716f)
                lineToRelative(-1.702f, -2.716f)
                lineTo(7.418f, 7.914f)
                lineToRelative(2.521f, 4.086f)
                lineToRelative(-2.521f, 4.086f)
                horizontalLineToRelative(2.987f)
                lineToRelative(1.702f, -2.716f)
                lineToRelative(1.702f, 2.716f)
                horizontalLineToRelative(0.466f)
                lineToRelative(2.52f, -0.0f)
                lineToRelative(-2.52f, -4.086f)
                lineToRelative(2.521f, -4.086f)
                horizontalLineToRelative(-2.525f)
                close()
            }
        }
        .build()
        return _nxp!!
    }

private var _nxp: ImageVector? = null
