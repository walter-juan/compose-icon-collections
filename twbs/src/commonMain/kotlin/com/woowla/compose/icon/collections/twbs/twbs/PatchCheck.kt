package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.PatchCheck: ImageVector
    get() {
        if (_patchCheck != null) {
            return _patchCheck!!
        }
        _patchCheck = Builder(name = "PatchCheck", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.354f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, -0.708f)
                lineTo(7.0f, 8.793f)
                lineToRelative(2.646f, -2.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.273f, 2.513f)
                lineToRelative(-0.921f, -0.944f)
                lineToRelative(0.715f, -0.698f)
                lineToRelative(0.622f, 0.637f)
                lineToRelative(0.89f, -0.011f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 2.924f, 2.924f)
                lineToRelative(-0.01f, 0.89f)
                lineToRelative(0.636f, 0.622f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 0.0f, 4.134f)
                lineToRelative(-0.637f, 0.622f)
                lineToRelative(0.011f, 0.89f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -2.924f, 2.924f)
                lineToRelative(-0.89f, -0.01f)
                lineToRelative(-0.622f, 0.636f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -4.134f, 0.0f)
                lineToRelative(-0.622f, -0.637f)
                lineToRelative(-0.89f, 0.011f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -2.924f, -2.924f)
                lineToRelative(0.01f, -0.89f)
                lineToRelative(-0.636f, -0.622f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 0.0f, -4.134f)
                lineToRelative(0.637f, -0.622f)
                lineToRelative(-0.011f, -0.89f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 2.924f, -2.924f)
                lineToRelative(0.89f, 0.01f)
                lineToRelative(0.622f, -0.636f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 4.134f, 0.0f)
                lineToRelative(-0.715f, 0.698f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -2.704f, 0.0f)
                lineToRelative(-0.92f, 0.944f)
                lineToRelative(-1.32f, -0.016f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -1.911f, 1.912f)
                lineToRelative(0.016f, 1.318f)
                lineToRelative(-0.944f, 0.921f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 0.0f, 2.704f)
                lineToRelative(0.944f, 0.92f)
                lineToRelative(-0.016f, 1.32f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 1.912f, 1.911f)
                lineToRelative(1.318f, -0.016f)
                lineToRelative(0.921f, 0.944f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 2.704f, 0.0f)
                lineToRelative(0.92f, -0.944f)
                lineToRelative(1.32f, 0.016f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 1.911f, -1.912f)
                lineToRelative(-0.016f, -1.318f)
                lineToRelative(0.944f, -0.921f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, 0.0f, -2.704f)
                lineToRelative(-0.944f, -0.92f)
                lineToRelative(0.016f, -1.32f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -1.912f, -1.911f)
                close()
            }
        }
        .build()
        return _patchCheck!!
    }

private var _patchCheck: ImageVector? = null
