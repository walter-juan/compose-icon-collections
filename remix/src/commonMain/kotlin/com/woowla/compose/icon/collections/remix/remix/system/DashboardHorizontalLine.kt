package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.DashboardHorizontalLine: ImageVector
    get() {
        if (_dashboardHorizontalLine != null) {
            return _dashboardHorizontalLine!!
        }
        _dashboardHorizontalLine = Builder(name = "DashboardHorizontalLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 10.552f, 3.448f, 11.0f, 4.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                curveTo(12.552f, 11.0f, 13.0f, 10.552f, 13.0f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.448f, 12.552f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 3.0f, 3.0f, 3.448f, 3.0f, 4.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(11.0f, 20.0f)
                curveTo(11.0f, 20.552f, 11.448f, 21.0f, 12.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 21.0f, 21.0f, 20.552f, 21.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 13.448f, 20.552f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(12.0f)
                curveTo(11.448f, 13.0f, 11.0f, 13.448f, 11.0f, 14.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(3.0f, 20.0f)
                curveTo(3.0f, 20.552f, 3.448f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(8.552f, 21.0f, 9.0f, 20.552f, 9.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 13.448f, 8.552f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 13.0f, 3.0f, 13.448f, 3.0f, 14.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.0f, 9.0f)
                verticalLineTo(5.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(20.552f, 11.0f, 21.0f, 10.552f, 21.0f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(15.448f, 3.0f, 15.0f, 3.448f, 15.0f, 4.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 10.552f, 15.448f, 11.0f, 16.0f, 11.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _dashboardHorizontalLine!!
    }

private var _dashboardHorizontalLine: ImageVector? = null
