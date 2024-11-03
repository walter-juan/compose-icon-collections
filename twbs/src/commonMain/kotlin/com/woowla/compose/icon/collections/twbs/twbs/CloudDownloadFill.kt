package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CloudDownloadFill: ImageVector
    get() {
        if (_cloudDownloadFill != null) {
            return _cloudDownloadFill!!
        }
        _cloudDownloadFill = Builder(name = "CloudDownloadFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 0.0f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, false, -3.594f, 1.342f)
                curveToRelative(-0.766f, 0.66f, -1.321f, 1.52f, -1.464f, 2.383f)
                curveTo(1.266f, 4.095f, 0.0f, 5.555f, 0.0f, 7.318f)
                curveTo(0.0f, 9.366f, 1.708f, 11.0f, 3.781f, 11.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(4.188f)
                curveTo(14.502f, 11.0f, 16.0f, 9.57f, 16.0f, 7.773f)
                curveToRelative(0.0f, -1.636f, -1.242f, -2.969f, -2.834f, -3.194f)
                curveTo(12.923f, 1.999f, 10.69f, 0.0f, 8.0f, 0.0f)
                moveToRelative(-0.354f, 15.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(8.5f, 14.293f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.293f)
                lineToRelative(-2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _cloudDownloadFill!!
    }

private var _cloudDownloadFill: ImageVector? = null
