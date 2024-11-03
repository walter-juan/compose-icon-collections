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

public val Twbs.CameraVideo: ImageVector
    get() {
        if (_cameraVideo != null) {
            return _cameraVideo!!
        }
        _cameraVideo = Builder(name = "CameraVideo", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(7.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.983f, 1.738f)
                lineToRelative(3.11f, -1.382f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 4.269f)
                verticalLineToRelative(7.462f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.406f, 0.913f)
                lineToRelative(-3.111f, -1.382f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.5f, 13.0f)
                lineTo(2.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(11.5f, 10.175f)
                lineTo(15.0f, 11.731f)
                lineTo(15.0f, 4.269f)
                lineToRelative(-3.5f, 1.556f)
                close()
                moveTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(10.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cameraVideo!!
    }

private var _cameraVideo: ImageVector? = null
