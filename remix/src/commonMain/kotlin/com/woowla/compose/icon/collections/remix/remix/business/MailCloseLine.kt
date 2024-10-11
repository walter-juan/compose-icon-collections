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

public val BusinessGroup.MailCloseLine: ImageVector
    get() {
        if (_mailCloseLine != null) {
            return _mailCloseLine!!
        }
        _mailCloseLine = Builder(name = "MailCloseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.238f)
                lineTo(12.072f, 14.338f)
                lineTo(4.0f, 7.216f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(4.511f, 5.0f)
                lineTo(12.062f, 11.662f)
                lineTo(19.501f, 5.0f)
                horizontalLineTo(4.511f)
                close()
                moveTo(21.414f, 19.0f)
                lineTo(23.535f, 21.121f)
                lineTo(22.121f, 22.535f)
                lineTo(20.0f, 20.414f)
                lineTo(17.879f, 22.535f)
                lineTo(16.465f, 21.121f)
                lineTo(18.586f, 19.0f)
                lineTo(16.465f, 16.879f)
                lineTo(17.879f, 15.465f)
                lineTo(20.0f, 17.586f)
                lineTo(22.121f, 15.465f)
                lineTo(23.535f, 16.879f)
                lineTo(21.414f, 19.0f)
                close()
            }
        }
        .build()
        return _mailCloseLine!!
    }

private var _mailCloseLine: ImageVector? = null
