package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BadgeSd: ImageVector
    get() {
        if (_badgeSd != null) {
            return _badgeSd!!
        }
        _badgeSd = Builder(name = "BadgeSd", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(5.077f, 11.114f)
                curveToRelative(-1.524f, 0.0f, -2.263f, -0.8f, -2.315f, -1.749f)
                horizontalLineToRelative(1.147f)
                curveToRelative(0.079f, 0.466f, 0.527f, 0.809f, 1.234f, 0.809f)
                curveToRelative(0.739f, 0.0f, 1.13f, -0.339f, 1.13f, -0.83f)
                curveToRelative(0.0f, -0.418f, -0.3f, -0.634f, -0.923f, -0.779f)
                lineToRelative(-0.927f, -0.215f)
                curveToRelative(-0.932f, -0.21f, -1.52f, -0.747f, -1.52f, -1.657f)
                curveToRelative(0.0f, -1.098f, 0.918f, -1.815f, 2.24f, -1.815f)
                curveToRelative(1.371f, 0.0f, 2.162f, 0.77f, 2.22f, 1.692f)
                lineTo(6.238f, 6.57f)
                curveToRelative(-0.075f, -0.43f, -0.466f, -0.76f, -1.103f, -0.76f)
                curveToRelative(-0.655f, 0.0f, -1.046f, 0.338f, -1.046f, 0.804f)
                curveToRelative(0.0f, 0.36f, 0.294f, 0.598f, 0.821f, 0.712f)
                lineToRelative(0.932f, 0.216f)
                curveToRelative(0.971f, 0.22f, 1.613f, 0.685f, 1.613f, 1.691f)
                curveToRelative(0.0f, 1.117f, -0.857f, 1.881f, -2.378f, 1.881f)
                moveTo(8.307f, 11.0f)
                lineTo(8.307f, 5.001f)
                horizontalLineToRelative(2.19f)
                curveToRelative(1.823f, 0.0f, 2.684f, 1.09f, 2.684f, 2.984f)
                curveToRelative(0.0f, 1.908f, -0.874f, 3.015f, -2.685f, 3.015f)
                close()
                moveTo(10.338f, 5.968f)
                horizontalLineToRelative(-0.844f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(0.844f)
                curveToRelative(1.116f, 0.0f, 1.622f, -0.667f, 1.622f, -2.02f)
                curveToRelative(0.0f, -1.354f, -0.51f, -2.04f, -1.622f, -2.04f)
            }
        }
        .build()
        return _badgeSd!!
    }

private var _badgeSd: ImageVector? = null
