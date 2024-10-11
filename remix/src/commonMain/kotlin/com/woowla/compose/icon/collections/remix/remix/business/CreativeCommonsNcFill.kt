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

public val BusinessGroup.CreativeCommonsNcFill: ImageVector
    get() {
        if (_creativeCommonsNcFill != null) {
            return _creativeCommonsNcFill!!
        }
        _creativeCommonsNcFill = Builder(name = "CreativeCommonsNcFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.256f, 5.672f)
                lineTo(7.835f, 9.249f)
                curveTo(7.622f, 9.617f, 7.5f, 10.044f, 7.5f, 10.5f)
                curveTo(7.5f, 11.881f, 8.619f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(14.0f)
                lineTo(14.09f, 13.008f)
                curveTo(14.323f, 13.05f, 14.5f, 13.255f, 14.5f, 13.5f)
                curveTo(14.5f, 13.776f, 14.276f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                curveTo(14.182f, 16.0f, 14.359f, 15.981f, 14.53f, 15.944f)
                lineTo(18.328f, 19.744f)
                curveTo(16.604f, 21.154f, 14.401f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 9.599f, 2.846f, 7.396f, 4.256f, 5.672f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 14.401f, 21.154f, 16.604f, 19.744f, 18.328f)
                lineTo(16.165f, 14.751f)
                curveTo(16.378f, 14.383f, 16.5f, 13.956f, 16.5f, 13.5f)
                curveTo(16.5f, 12.119f, 15.381f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(10.0f)
                lineTo(9.91f, 10.992f)
                curveTo(9.677f, 10.95f, 9.5f, 10.745f, 9.5f, 10.5f)
                curveTo(9.5f, 10.224f, 9.724f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                curveTo(9.819f, 8.0f, 9.642f, 8.019f, 9.471f, 8.056f)
                lineTo(5.672f, 4.256f)
                curveTo(7.396f, 2.846f, 9.599f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsNcFill!!
    }

private var _creativeCommonsNcFill: ImageVector? = null
