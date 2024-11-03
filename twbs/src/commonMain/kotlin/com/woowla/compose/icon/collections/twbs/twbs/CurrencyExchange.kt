package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CurrencyExchange: ImageVector
    get() {
        if (_currencyExchange != null) {
            return _currencyExchange!!
        }
        _currencyExchange = Builder(name = "CurrencyExchange", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.027f, 4.905f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.544f, -2.073f)
                curveTo(3.695f, 7.536f, 3.132f, 6.864f, 3.0f, 5.91f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.426f)
                horizontalLineToRelative(0.466f)
                lineTo(2.966f, 5.05f)
                quadToRelative(-0.001f, -0.07f, 0.004f, -0.135f)
                lineTo(2.5f, 4.915f)
                verticalLineToRelative(-0.427f)
                horizontalLineToRelative(0.511f)
                curveTo(3.236f, 3.24f, 4.213f, 2.5f, 5.681f, 2.5f)
                curveToRelative(0.316f, 0.0f, 0.59f, 0.031f, 0.819f, 0.085f)
                verticalLineToRelative(0.733f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.815f, -0.082f)
                curveToRelative(-0.919f, 0.0f, -1.538f, 0.466f, -1.734f, 1.252f)
                horizontalLineToRelative(1.917f)
                verticalLineToRelative(0.427f)
                horizontalLineToRelative(-1.98f)
                quadToRelative(-0.004f, 0.07f, -0.003f, 0.147f)
                verticalLineToRelative(0.422f)
                horizontalLineToRelative(1.983f)
                verticalLineToRelative(0.427f)
                lineTo(3.93f, 5.911f)
                curveToRelative(0.118f, 0.602f, 0.468f, 1.03f, 1.005f, 1.229f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 4.97f, -3.113f)
                arcTo(5.002f, 5.002f, 0.0f, false, false, 0.0f, 5.0f)
                moveToRelative(16.0f, 5.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                moveToRelative(-7.75f, 1.322f)
                curveToRelative(0.069f, 0.835f, 0.746f, 1.485f, 1.964f, 1.562f)
                lineTo(10.214f, 14.0f)
                horizontalLineToRelative(0.54f)
                verticalLineToRelative(-0.62f)
                curveToRelative(1.259f, -0.086f, 1.996f, -0.74f, 1.996f, -1.69f)
                curveToRelative(0.0f, -0.865f, -0.563f, -1.31f, -1.57f, -1.54f)
                lineToRelative(-0.426f, -0.1f)
                lineTo(10.754f, 8.374f)
                curveToRelative(0.54f, 0.06f, 0.884f, 0.347f, 0.966f, 0.745f)
                horizontalLineToRelative(0.948f)
                curveToRelative(-0.07f, -0.804f, -0.779f, -1.433f, -1.914f, -1.502f)
                lineTo(10.754f, 7.0f)
                horizontalLineToRelative(-0.54f)
                verticalLineToRelative(0.629f)
                curveToRelative(-1.076f, 0.103f, -1.808f, 0.732f, -1.808f, 1.622f)
                curveToRelative(0.0f, 0.787f, 0.544f, 1.288f, 1.45f, 1.493f)
                lineToRelative(0.358f, 0.085f)
                verticalLineToRelative(1.78f)
                curveToRelative(-0.554f, -0.08f, -0.92f, -0.376f, -1.003f, -0.787f)
                close()
                moveTo(10.21f, 9.927f)
                curveToRelative(-0.532f, -0.12f, -0.82f, -0.364f, -0.82f, -0.732f)
                curveToRelative(0.0f, -0.41f, 0.311f, -0.719f, 0.824f, -0.809f)
                verticalLineToRelative(1.54f)
                horizontalLineToRelative(-0.005f)
                close()
                moveTo(10.832f, 10.971f)
                curveToRelative(0.645f, 0.145f, 0.943f, 0.38f, 0.943f, 0.796f)
                curveToRelative(0.0f, 0.474f, -0.37f, 0.8f, -1.02f, 0.86f)
                verticalLineToRelative(-1.674f)
                close()
            }
        }
        .build()
        return _currencyExchange!!
    }

private var _currencyExchange: ImageVector? = null
