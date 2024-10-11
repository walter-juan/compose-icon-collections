package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.AlignItemHorizontalCenterLine: ImageVector
    get() {
        if (_alignItemHorizontalCenterLine != null) {
            return _alignItemHorizontalCenterLine!!
        }
        _alignItemHorizontalCenterLine = Builder(name = "AlignItemHorizontalCenterLine",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 4.0f, 20.0f, 4.448f, 20.0f, 5.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 10.552f, 19.552f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 13.0f, 18.0f, 13.448f, 18.0f, 14.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 19.552f, 17.552f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 20.0f, 6.0f, 19.552f, 6.0f, 19.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 13.448f, 6.448f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 11.0f, 4.0f, 10.552f, 4.0f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _alignItemHorizontalCenterLine!!
    }

private var _alignItemHorizontalCenterLine: ImageVector? = null