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

public val RegularGroup.BxPen: ImageVector
    get() {
        if (_bxPen != null) {
            return _bxPen!!
        }
        _bxPen = Builder(name = "BxPen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.404f, 2.998f)
                curveToRelative(-0.757f, -0.754f, -2.077f, -0.751f, -2.828f, 0.005f)
                lineToRelative(-1.784f, 1.791f)
                lineTo(11.586f, 7.0f)
                lineTo(7.0f, 7.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.939f, 0.658f)
                lineToRelative(-4.0f, 11.0f)
                curveToRelative(-0.133f, 0.365f, -0.042f, 0.774f, 0.232f, 1.049f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.049f, 0.232f)
                lineToRelative(11.0f, -4.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 17.0f, 17.0f)
                verticalLineToRelative(-4.586f)
                lineToRelative(2.207f, -2.207f)
                verticalLineToRelative(-0.001f)
                horizontalLineToRelative(0.001f)
                lineTo(21.0f, 8.409f)
                curveToRelative(0.378f, -0.378f, 0.586f, -0.881f, 0.585f, -1.415f)
                curveToRelative(0.0f, -0.535f, -0.209f, -1.038f, -0.588f, -1.415f)
                lineToRelative(-2.593f, -2.581f)
                close()
                moveTo(15.293f, 11.293f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 15.0f, 12.0f)
                verticalLineToRelative(4.3f)
                lineToRelative(-9.249f, 3.363f)
                lineToRelative(4.671f, -4.671f)
                curveToRelative(0.026f, 0.001f, 0.052f, 0.008f, 0.078f, 0.008f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 9.0f, 13.5f)
                curveToRelative(0.0f, 0.026f, 0.007f, 0.052f, 0.008f, 0.078f)
                lineToRelative(-4.671f, 4.671f)
                lineTo(7.7f, 9.0f)
                lineTo(12.0f, 9.0f)
                curveToRelative(0.266f, 0.0f, 0.52f, -0.105f, 0.707f, -0.293f)
                lineTo(14.5f, 6.914f)
                lineTo(17.086f, 9.5f)
                lineToRelative(-1.793f, 1.793f)
                close()
                moveTo(18.499f, 8.085f)
                lineTo(15.913f, 5.499f)
                lineTo(16.992f, 4.415f)
                lineTo(19.585f, 6.996f)
                lineTo(18.499f, 8.085f)
                close()
            }
        }
        .build()
        return _bxPen!!
    }

private var _bxPen: ImageVector? = null
