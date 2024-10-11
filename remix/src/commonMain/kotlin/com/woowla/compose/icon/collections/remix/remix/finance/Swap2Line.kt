package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.Swap2Line: ImageVector
    get() {
        if (_swap2Line != null) {
            return _swap2Line!!
        }
        _swap2Line = Builder(name = "Swap2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.207f, 2.293f)
                lineTo(15.793f, 3.707f)
                lineTo(18.086f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.086f)
                lineTo(15.793f, 10.293f)
                lineTo(17.207f, 11.707f)
                lineTo(21.914f, 7.0f)
                lineTo(17.207f, 2.293f)
                close()
                moveTo(9.5f, 7.0f)
                curveTo(9.5f, 5.619f, 8.381f, 4.5f, 7.0f, 4.5f)
                curveTo(5.619f, 4.5f, 4.5f, 5.619f, 4.5f, 7.0f)
                curveTo(4.5f, 8.381f, 5.619f, 9.5f, 7.0f, 9.5f)
                curveTo(8.381f, 9.5f, 9.5f, 8.381f, 9.5f, 7.0f)
                close()
                moveTo(11.5f, 7.0f)
                curveTo(11.5f, 9.485f, 9.485f, 11.5f, 7.0f, 11.5f)
                curveTo(4.515f, 11.5f, 2.5f, 9.485f, 2.5f, 7.0f)
                curveTo(2.5f, 4.515f, 4.515f, 2.5f, 7.0f, 2.5f)
                curveTo(9.485f, 2.5f, 11.5f, 4.515f, 11.5f, 7.0f)
                close()
                moveTo(5.914f, 18.0f)
                lineTo(8.207f, 20.293f)
                lineTo(6.793f, 21.707f)
                lineTo(2.086f, 17.0f)
                lineTo(6.793f, 12.293f)
                lineTo(8.207f, 13.707f)
                lineTo(5.914f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.914f)
                close()
                moveTo(15.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveTo(13.0f, 13.448f, 13.448f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 13.0f, 21.0f, 13.448f, 21.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(13.448f, 21.0f, 13.0f, 20.552f, 13.0f, 20.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _swap2Line!!
    }

private var _swap2Line: ImageVector? = null
