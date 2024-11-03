package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.406f, 1.342f)
                arcTo(5.53f, 5.53f, 0.0f, false, true, 8.0f, 0.0f)
                curveToRelative(2.69f, 0.0f, 4.923f, 2.0f, 5.166f, 4.579f)
                curveTo(14.758f, 4.804f, 16.0f, 6.137f, 16.0f, 7.773f)
                curveTo(16.0f, 9.569f, 14.502f, 11.0f, 12.687f, 11.0f)
                horizontalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.688f)
                curveTo(13.979f, 10.0f, 15.0f, 8.988f, 15.0f, 7.773f)
                curveToRelative(0.0f, -1.216f, -1.02f, -2.228f, -2.313f, -2.228f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveTo(12.188f, 2.825f, 10.328f, 1.0f, 8.0f, 1.0f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, -2.941f, 1.1f)
                curveToRelative(-0.757f, 0.652f, -1.153f, 1.438f, -1.153f, 2.055f)
                verticalLineToRelative(0.448f)
                lineToRelative(-0.445f, 0.049f)
                curveTo(2.064f, 4.805f, 1.0f, 5.952f, 1.0f, 7.318f)
                curveTo(1.0f, 8.785f, 2.23f, 10.0f, 3.781f, 10.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(3.781f)
                curveTo(1.708f, 11.0f, 0.0f, 9.366f, 0.0f, 7.318f)
                curveToRelative(0.0f, -1.763f, 1.266f, -3.223f, 2.942f, -3.593f)
                curveToRelative(0.143f, -0.863f, 0.698f, -1.723f, 1.464f, -2.383f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.646f, 15.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(8.5f, 14.293f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(8.793f)
                lineToRelative(-2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
