package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.PassValidFill: ImageVector
    get() {
        if (_passValidFill != null) {
            return _passValidFill!!
        }
        _passValidFill = Builder(name = "PassValidFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                curveTo(1.448f, 4.0f, 1.0f, 4.448f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.552f, 1.448f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 20.0f, 23.0f, 19.552f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 4.448f, 22.552f, 4.0f, 22.0f, 4.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.0f, 9.448f, 8.552f, 9.0f, 8.0f, 9.0f)
                curveTo(7.448f, 9.0f, 7.0f, 9.448f, 7.0f, 10.0f)
                curveTo(7.0f, 10.552f, 7.448f, 11.0f, 8.0f, 11.0f)
                curveTo(8.552f, 11.0f, 9.0f, 10.552f, 9.0f, 10.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 11.657f, 9.657f, 13.0f, 8.0f, 13.0f)
                curveTo(6.343f, 13.0f, 5.0f, 11.657f, 5.0f, 10.0f)
                curveTo(5.0f, 8.343f, 6.343f, 7.0f, 8.0f, 7.0f)
                curveTo(9.657f, 7.0f, 11.0f, 8.343f, 11.0f, 10.0f)
                close()
                moveTo(5.527f, 17.025f)
                lineTo(4.113f, 15.611f)
                curveTo(5.107f, 14.617f, 6.484f, 14.0f, 8.002f, 14.0f)
                curveTo(9.521f, 14.0f, 10.897f, 14.617f, 11.891f, 15.611f)
                lineTo(10.477f, 17.025f)
                curveTo(9.843f, 16.391f, 8.969f, 16.0f, 8.002f, 16.0f)
                curveTo(7.035f, 16.0f, 6.162f, 16.391f, 5.527f, 17.025f)
                close()
                moveTo(20.207f, 10.707f)
                lineTo(16.207f, 14.707f)
                lineTo(15.5f, 15.414f)
                lineTo(14.793f, 14.707f)
                lineTo(12.293f, 12.207f)
                lineTo(13.707f, 10.793f)
                lineTo(15.5f, 12.586f)
                lineTo(18.793f, 9.293f)
                lineTo(20.207f, 10.707f)
                close()
            }
        }
        .build()
        return _passValidFill!!
    }

private var _passValidFill: ImageVector? = null