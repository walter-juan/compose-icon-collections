package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FolderSymlinkFill: ImageVector
    get() {
        if (_folderSymlinkFill != null) {
            return _folderSymlinkFill!!
        }
        _folderSymlinkFill = Builder(name = "FolderSymlinkFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.81f, 3.0f)
                lineTo(9.828f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.414f, -0.586f)
                lineToRelative(-0.828f, -0.828f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.172f, 1.0f)
                lineTo(2.5f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineToRelative(0.04f, 0.87f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.342f, 1.311f)
                lineToRelative(0.637f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.826f, 14.0f)
                horizontalLineToRelative(10.348f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.991f, -1.819f)
                lineToRelative(0.637f, -7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.81f, 3.0f)
                moveTo(2.19f, 3.0f)
                quadToRelative(-0.362f, 0.002f, -0.683f, 0.12f)
                lineTo(1.5f, 2.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -0.98f)
                horizontalLineToRelative(3.672f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 0.293f)
                lineTo(7.586f, 3.0f)
                close()
                moveTo(11.798f, 8.271f)
                lineTo(8.616f, 10.241f)
                curveToRelative(-0.27f, 0.166f, -0.616f, -0.036f, -0.616f, -0.372f)
                lineTo(8.0f, 9.1f)
                reflectiveCurveToRelative(-2.571f, -0.3f, -4.0f, 2.4f)
                curveToRelative(0.571f, -4.8f, 3.143f, -4.8f, 4.0f, -4.8f)
                verticalLineToRelative(-0.769f)
                curveToRelative(0.0f, -0.336f, 0.346f, -0.538f, 0.616f, -0.371f)
                lineToRelative(3.182f, 1.969f)
                curveToRelative(0.27f, 0.166f, 0.27f, 0.576f, 0.0f, 0.742f)
            }
        }
        .build()
        return _folderSymlinkFill!!
    }

private var _folderSymlinkFill: ImageVector? = null
