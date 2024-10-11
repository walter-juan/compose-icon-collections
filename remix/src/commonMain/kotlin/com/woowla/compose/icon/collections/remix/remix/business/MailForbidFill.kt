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

public val BusinessGroup.MailForbidFill: ImageVector
    get() {
        if (_mailForbidFill != null) {
            return _mailForbidFill!!
        }
        _mailForbidFill = Builder(name = "MailForbidFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.266f, 11.554f)
                lineTo(19.654f, 7.756f)
                lineTo(18.346f, 6.244f)
                lineTo(12.061f, 11.683f)
                lineTo(5.647f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineTo(12.055f, 14.302f)
                curveTo(11.387f, 15.375f, 11.0f, 16.642f, 11.0f, 18.0f)
                curveTo(11.0f, 19.074f, 11.242f, 20.091f, 11.674f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(12.255f)
                curveTo(20.866f, 11.464f, 19.487f, 11.0f, 18.0f, 11.0f)
                curveTo(17.03f, 11.0f, 16.106f, 11.197f, 15.266f, 11.554f)
                close()
                moveTo(16.707f, 20.708f)
                curveTo(17.098f, 20.895f, 17.537f, 21.0f, 18.0f, 21.0f)
                curveTo(19.657f, 21.0f, 21.0f, 19.657f, 21.0f, 18.0f)
                curveTo(21.0f, 17.537f, 20.895f, 17.098f, 20.708f, 16.707f)
                lineTo(16.707f, 20.708f)
                close()
                moveTo(15.292f, 19.293f)
                lineTo(19.293f, 15.292f)
                curveTo(18.902f, 15.105f, 18.463f, 15.0f, 18.0f, 15.0f)
                curveTo(16.343f, 15.0f, 15.0f, 16.343f, 15.0f, 18.0f)
                curveTo(15.0f, 18.463f, 15.105f, 18.902f, 15.292f, 19.293f)
                close()
                moveTo(18.0f, 23.0f)
                curveTo(15.239f, 23.0f, 13.0f, 20.761f, 13.0f, 18.0f)
                curveTo(13.0f, 15.239f, 15.239f, 13.0f, 18.0f, 13.0f)
                curveTo(20.761f, 13.0f, 23.0f, 15.239f, 23.0f, 18.0f)
                curveTo(23.0f, 20.761f, 20.761f, 23.0f, 18.0f, 23.0f)
                close()
            }
        }
        .build()
        return _mailForbidFill!!
    }

private var _mailForbidFill: ImageVector? = null