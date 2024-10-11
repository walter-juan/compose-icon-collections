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

public val BusinessGroup.MailStarLine: ImageVector
    get() {
        if (_mailStarLine != null) {
            return _mailStarLine!!
        }
        _mailStarLine = Builder(name = "MailStarLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.238f)
                lineTo(12.072f, 14.338f)
                lineTo(4.0f, 7.216f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(4.511f, 5.0f)
                lineTo(12.062f, 11.662f)
                lineTo(19.501f, 5.0f)
                horizontalLineTo(4.511f)
                close()
                moveTo(19.5f, 21.75f)
                lineTo(16.855f, 23.141f)
                lineTo(17.36f, 20.195f)
                lineTo(15.22f, 18.109f)
                lineTo(18.177f, 17.68f)
                lineTo(19.5f, 15.0f)
                lineTo(20.823f, 17.68f)
                lineTo(23.78f, 18.109f)
                lineTo(21.64f, 20.195f)
                lineTo(22.145f, 23.141f)
                lineTo(19.5f, 21.75f)
                close()
            }
        }
        .build()
        return _mailStarLine!!
    }

private var _mailStarLine: ImageVector? = null
