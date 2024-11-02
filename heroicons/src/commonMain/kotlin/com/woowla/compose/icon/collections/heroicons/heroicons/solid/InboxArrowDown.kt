package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.InboxArrowDown: ImageVector
    get() {
        if (_inboxArrowDown != null) {
            return _inboxArrowDown!!
        }
        _inboxArrowDown = Builder(name = "InboxArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.478f, 5.559f)
                curveTo(5.672f, 4.929f, 6.253f, 4.5f, 6.912f, 4.5f)
                horizontalLineTo(9.0f)
                curveTo(9.414f, 4.5f, 9.75f, 4.164f, 9.75f, 3.75f)
                curveTo(9.75f, 3.336f, 9.414f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(6.912f)
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
                horizontalLineTo(15.0f)
                curveTo(14.586f, 3.0f, 14.25f, 3.336f, 14.25f, 3.75f)
                curveTo(14.25f, 4.164f, 14.586f, 4.5f, 15.0f, 4.5f)
                horizontalLineTo(17.088f)
                curveTo(17.747f, 4.5f, 18.328f, 4.929f, 18.522f, 5.559f)
                lineTo(20.735f, 12.75f)
                horizontalLineTo(17.891f)
                curveTo(16.754f, 12.75f, 15.715f, 13.392f, 15.207f, 14.408f)
                lineTo(14.951f, 14.921f)
                curveTo(14.697f, 15.429f, 14.178f, 15.75f, 13.609f, 15.75f)
                horizontalLineTo(10.391f)
                curveTo(9.822f, 15.75f, 9.303f, 15.429f, 9.049f, 14.921f)
                lineTo(8.793f, 14.408f)
                curveTo(8.285f, 13.392f, 7.246f, 12.75f, 6.109f, 12.75f)
                horizontalLineTo(3.265f)
                lineTo(5.478f, 5.559f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(12.414f, 2.25f, 12.75f, 2.586f, 12.75f, 3.0f)
                verticalLineTo(9.439f)
                lineTo(14.47f, 7.72f)
                curveTo(14.763f, 7.427f, 15.237f, 7.427f, 15.53f, 7.72f)
                curveTo(15.823f, 8.013f, 15.823f, 8.487f, 15.53f, 8.78f)
                lineTo(12.53f, 11.78f)
                curveTo(12.237f, 12.073f, 11.763f, 12.073f, 11.47f, 11.78f)
                lineTo(8.47f, 8.78f)
                curveTo(8.177f, 8.487f, 8.177f, 8.013f, 8.47f, 7.72f)
                curveTo(8.763f, 7.427f, 9.237f, 7.427f, 9.53f, 7.72f)
                lineTo(11.25f, 9.439f)
                verticalLineTo(3.0f)
                curveTo(11.25f, 2.586f, 11.586f, 2.25f, 12.0f, 2.25f)
                close()
            }
        }
        .build()
        return _inboxArrowDown!!
    }

private var _inboxArrowDown: ImageVector? = null
