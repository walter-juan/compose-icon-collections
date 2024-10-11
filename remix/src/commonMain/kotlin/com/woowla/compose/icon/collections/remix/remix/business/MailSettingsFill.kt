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

public val BusinessGroup.MailSettingsFill: ImageVector
    get() {
        if (_mailSettingsFill != null) {
            return _mailSettingsFill!!
        }
        _mailSettingsFill = Builder(name = "MailSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.341f)
                curveTo(21.374f, 13.12f, 20.701f, 13.0f, 20.0f, 13.0f)
                curveTo(16.686f, 13.0f, 14.0f, 15.686f, 14.0f, 19.0f)
                curveTo(14.0f, 19.701f, 14.12f, 20.374f, 14.341f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(13.341f)
                close()
                moveTo(12.061f, 11.683f)
                lineTo(5.647f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineTo(12.073f, 14.317f)
                lineTo(19.654f, 7.756f)
                lineTo(18.346f, 6.244f)
                lineTo(12.061f, 11.683f)
                close()
                moveTo(17.05f, 19.549f)
                curveTo(17.017f, 19.371f, 17.0f, 19.187f, 17.0f, 19.0f)
                curveTo(17.0f, 18.813f, 17.017f, 18.629f, 17.05f, 18.451f)
                lineTo(16.036f, 17.866f)
                lineTo(17.036f, 16.134f)
                lineTo(18.051f, 16.72f)
                curveTo(18.328f, 16.482f, 18.649f, 16.295f, 19.0f, 16.171f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.171f)
                curveTo(21.351f, 16.295f, 21.672f, 16.482f, 21.949f, 16.72f)
                lineTo(22.964f, 16.134f)
                lineTo(23.964f, 17.866f)
                lineTo(22.95f, 18.451f)
                curveTo(22.983f, 18.629f, 23.0f, 18.813f, 23.0f, 19.0f)
                curveTo(23.0f, 19.187f, 22.983f, 19.371f, 22.95f, 19.549f)
                lineTo(23.964f, 20.134f)
                lineTo(22.964f, 21.866f)
                lineTo(21.949f, 21.28f)
                curveTo(21.672f, 21.518f, 21.351f, 21.705f, 21.0f, 21.829f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.829f)
                curveTo(18.649f, 21.705f, 18.328f, 21.518f, 18.051f, 21.28f)
                lineTo(17.036f, 21.866f)
                lineTo(16.036f, 20.134f)
                lineTo(17.05f, 19.549f)
                close()
                moveTo(20.0f, 20.0f)
                curveTo(20.552f, 20.0f, 21.0f, 19.552f, 21.0f, 19.0f)
                curveTo(21.0f, 18.448f, 20.552f, 18.0f, 20.0f, 18.0f)
                curveTo(19.448f, 18.0f, 19.0f, 18.448f, 19.0f, 19.0f)
                curveTo(19.0f, 19.552f, 19.448f, 20.0f, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _mailSettingsFill!!
    }

private var _mailSettingsFill: ImageVector? = null
