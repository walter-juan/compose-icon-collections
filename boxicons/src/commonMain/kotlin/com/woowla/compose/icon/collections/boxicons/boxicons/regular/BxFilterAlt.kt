package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxFilterAlt: ImageVector
    get() {
        if (_bxFilterAlt != null) {
            return _bxFilterAlt!!
        }
        _bxFilterAlt = Builder(name = "BxFilterAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.59f)
                curveToRelative(0.0f, 0.523f, 0.213f, 1.037f, 0.583f, 1.407f)
                lineTo(10.0f, 13.414f)
                lineTo(10.0f, 21.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 1.447f, 0.895f)
                lineToRelative(4.0f, -2.0f)
                curveToRelative(0.339f, -0.17f, 0.553f, -0.516f, 0.553f, -0.895f)
                verticalLineToRelative(-5.586f)
                lineToRelative(5.417f, -5.417f)
                curveToRelative(0.37f, -0.37f, 0.583f, -0.884f, 0.583f, -1.407f)
                lineTo(22.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(14.293f, 12.293f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 14.0f, 13.0f)
                verticalLineToRelative(5.382f)
                lineToRelative(-2.0f, 1.0f)
                lineTo(12.0f, 13.0f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, -0.293f, -0.707f)
                lineTo(6.0f, 6.59f)
                lineTo(6.0f, 5.0f)
                horizontalLineToRelative(14.001f)
                lineToRelative(0.002f, 1.583f)
                lineToRelative(-5.71f, 5.71f)
                close()
            }
        }
        .build()
        return _bxFilterAlt!!
    }

private var _bxFilterAlt: ImageVector? = null
