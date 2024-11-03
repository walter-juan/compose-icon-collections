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

public val Twbs.Vignette: ImageVector
    get() {
        if (_vignette != null) {
            return _vignette!!
        }
        _vignette = Builder(name = "Vignette", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.0f, 1.0f)
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                moveToRelative(1.683f, -6.281f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.866f, 0.5f)
                moveToRelative(-3.5f, 6.062f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.866f, 0.5f)
                moveToRelative(4.598f, -4.598f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.866f)
                moveToRelative(-6.062f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.866f)
                moveTo(11.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                moveToRelative(6.281f, 1.683f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.866f)
                moveToRelative(-6.062f, -3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.866f)
                moveToRelative(4.598f, 4.598f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.866f, 0.5f)
                moveToRelative(-3.5f, -6.062f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.866f, 0.5f)
            }
        }
        .build()
        return _vignette!!
    }

private var _vignette: ImageVector? = null
