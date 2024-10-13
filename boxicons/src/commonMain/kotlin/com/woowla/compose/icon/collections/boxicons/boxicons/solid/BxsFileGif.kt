package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsFileGif: ImageVector
    get() {
        if (_bxsFileGif != null) {
            return _bxsFileGif!!
        }
        _bxsFileGif = Builder(name = "BxsFileGif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 8.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(11.333f, 17.772f)
                arcTo(4.512f, 4.512f, 0.0f, false, true, 9.984f, 18.0f)
                curveToRelative(-0.737f, 0.0f, -1.271f, -0.186f, -1.644f, -0.546f)
                curveToRelative(-0.371f, -0.348f, -0.575f, -0.875f, -0.569f, -1.469f)
                curveToRelative(0.006f, -1.344f, 0.983f, -2.111f, 2.309f, -2.111f)
                curveToRelative(0.521f, 0.0f, 0.924f, 0.103f, 1.121f, 0.198f)
                lineToRelative(-0.191f, 0.731f)
                curveToRelative(-0.222f, -0.096f, -0.498f, -0.174f, -0.941f, -0.174f)
                curveToRelative(-0.762f, 0.0f, -1.338f, 0.432f, -1.338f, 1.308f)
                curveToRelative(0.0f, 0.833f, 0.522f, 1.325f, 1.271f, 1.325f)
                curveToRelative(0.21f, 0.0f, 0.378f, -0.024f, 0.45f, -0.061f)
                verticalLineToRelative(-0.846f)
                horizontalLineToRelative(-0.624f)
                verticalLineToRelative(-0.713f)
                horizontalLineToRelative(1.505f)
                verticalLineToRelative(2.13f)
                close()
                moveTo(12.967f, 17.958f)
                horizontalLineToRelative(-0.918f)
                verticalLineToRelative(-4.042f)
                horizontalLineToRelative(0.918f)
                verticalLineToRelative(4.042f)
                close()
                moveTo(16.229f, 14.666f)
                horizontalLineToRelative(-1.553f)
                verticalLineToRelative(0.923f)
                horizontalLineToRelative(1.451f)
                verticalLineToRelative(0.744f)
                horizontalLineToRelative(-1.451f)
                verticalLineToRelative(1.625f)
                horizontalLineToRelative(-0.918f)
                verticalLineToRelative(-4.042f)
                horizontalLineToRelative(2.471f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 4.0f)
                lineToRelative(5.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _bxsFileGif!!
    }

private var _bxsFileGif: ImageVector? = null
