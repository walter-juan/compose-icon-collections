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

public val BusinessGroup.InfoCardFill: ImageVector
    get() {
        if (_infoCardFill != null) {
            return _infoCardFill!!
        }
        _infoCardFill = Builder(name = "InfoCardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(9.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(7.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _infoCardFill!!
    }

private var _infoCardFill: ImageVector? = null
