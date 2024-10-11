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

public val BusinessGroup.MailOpenLine: ImageVector
    get() {
        if (_mailOpenLine != null) {
            return _mailOpenLine!!
        }
        _mailOpenLine = Builder(name = "MailOpenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.243f, 6.854f)
                lineTo(11.49f, 1.309f)
                curveTo(11.806f, 1.119f, 12.202f, 1.119f, 12.519f, 1.309f)
                lineTo(21.757f, 6.854f)
                curveTo(21.908f, 6.945f, 22.0f, 7.107f, 22.0f, 7.283f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(7.283f)
                curveTo(2.0f, 7.107f, 2.092f, 6.945f, 2.243f, 6.854f)
                close()
                moveTo(4.0f, 8.133f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.132f)
                lineTo(12.004f, 3.332f)
                lineTo(4.0f, 8.133f)
                close()
                moveTo(12.06f, 13.698f)
                lineTo(17.356f, 9.235f)
                lineTo(18.644f, 10.765f)
                lineTo(12.074f, 16.302f)
                lineTo(5.364f, 10.772f)
                lineTo(6.636f, 9.228f)
                lineTo(12.06f, 13.698f)
                close()
            }
        }
        .build()
        return _mailOpenLine!!
    }

private var _mailOpenLine: ImageVector? = null
