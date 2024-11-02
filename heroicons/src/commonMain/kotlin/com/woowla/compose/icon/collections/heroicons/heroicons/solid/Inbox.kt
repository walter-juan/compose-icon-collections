package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.912f, 3.0f)
                curveTo(5.595f, 3.0f, 4.432f, 3.859f, 4.044f, 5.118f)
                lineTo(1.633f, 12.956f)
                curveTo(1.545f, 13.242f, 1.5f, 13.539f, 1.5f, 13.838f)
                verticalLineTo(18.0f)
                curveTo(1.5f, 19.657f, 2.843f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 21.0f, 22.5f, 19.657f, 22.5f, 18.0f)
                verticalLineTo(13.838f)
                curveTo(22.5f, 13.539f, 22.455f, 13.242f, 22.367f, 12.956f)
                lineTo(19.955f, 5.118f)
                curveTo(19.568f, 3.859f, 18.405f, 3.0f, 17.088f, 3.0f)
                horizontalLineTo(6.912f)
                close()
                moveTo(20.735f, 12.75f)
                lineTo(18.522f, 5.559f)
                curveTo(18.328f, 4.929f, 17.747f, 4.5f, 17.088f, 4.5f)
                horizontalLineTo(6.912f)
                curveTo(6.253f, 4.5f, 5.672f, 4.929f, 5.478f, 5.559f)
                lineTo(3.265f, 12.75f)
                horizontalLineTo(6.109f)
                curveTo(7.246f, 12.75f, 8.285f, 13.392f, 8.793f, 14.408f)
                lineTo(9.049f, 14.921f)
                curveTo(9.303f, 15.429f, 9.822f, 15.75f, 10.391f, 15.75f)
                horizontalLineTo(13.609f)
                curveTo(14.178f, 15.75f, 14.697f, 15.429f, 14.951f, 14.921f)
                lineTo(15.207f, 14.408f)
                curveTo(15.715f, 13.392f, 16.754f, 12.75f, 17.891f, 12.75f)
                horizontalLineTo(20.735f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
