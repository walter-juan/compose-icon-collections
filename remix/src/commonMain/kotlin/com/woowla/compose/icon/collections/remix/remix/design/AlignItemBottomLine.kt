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

public val DesignGroup.AlignItemBottomLine: ImageVector
    get() {
        if (_alignItemBottomLine != null) {
            return _alignItemBottomLine!!
        }
        _alignItemBottomLine = Builder(name = "AlignItemBottomLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(5.0f, 3.0f)
                curveTo(4.448f, 3.0f, 4.0f, 3.448f, 4.0f, 4.0f)
                lineTo(4.0f, 16.0f)
                curveTo(4.0f, 16.552f, 4.448f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(10.552f, 17.0f, 11.0f, 16.552f, 11.0f, 16.0f)
                lineTo(11.0f, 4.0f)
                curveTo(11.0f, 3.448f, 10.552f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(15.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveTo(13.0f, 7.448f, 13.448f, 7.0f, 14.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                curveTo(19.552f, 7.0f, 20.0f, 7.448f, 20.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 16.552f, 19.552f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(13.448f, 17.0f, 13.0f, 16.552f, 13.0f, 16.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _alignItemBottomLine!!
    }

private var _alignItemBottomLine: ImageVector? = null
