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

public val BusinessGroup.PassPendingLine: ImageVector
    get() {
        if (_passPendingLine != null) {
            return _passPendingLine!!
        }
        _passPendingLine = Builder(name = "PassPendingLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(1.0f, 5.0f)
                curveTo(1.0f, 4.448f, 1.448f, 4.0f, 2.0f, 4.0f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 4.0f, 23.0f, 4.448f, 23.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(23.0f, 19.552f, 22.552f, 20.0f, 22.0f, 20.0f)
                horizontalLineTo(2.0f)
                curveTo(1.448f, 20.0f, 1.0f, 19.552f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
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
                moveTo(8.002f, 16.0f)
                curveTo(7.035f, 16.0f, 6.161f, 16.391f, 5.527f, 17.025f)
                lineTo(4.113f, 15.611f)
                curveTo(5.107f, 14.617f, 6.483f, 14.0f, 8.002f, 14.0f)
                curveTo(9.52f, 14.0f, 10.897f, 14.617f, 11.891f, 15.611f)
                lineTo(10.477f, 17.025f)
                curveTo(9.842f, 16.391f, 8.969f, 16.0f, 8.002f, 16.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(17.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _passPendingLine!!
    }

private var _passPendingLine: ImageVector? = null
