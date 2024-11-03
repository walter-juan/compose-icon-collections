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

public val Twbs.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.555f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.624f, 0.492f)
                arcTo(1.503f, 1.503f, 0.0f, false, true, 13.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.1f, -3.998f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.51f, -0.375f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 8.0f)
                moveToRelative(4.473f, 3.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.72f, -0.99f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 16.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(14.243f, 3.464f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, -0.707f)
                lineToRelative(-0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                close()
                moveTo(6.464f, 2.757f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.707f)
                lineToRelative(0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, -0.708f)
                close()
                moveTo(8.198f, 6.131f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.296f, 2.198f)
                quadToRelative(0.3f, 0.423f, 0.516f, 0.898f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.84f, -3.225f)
                quadToRelative(0.529f, 0.017f, 1.028f, 0.129f)
                moveToRelative(4.484f, 4.074f)
                curveToRelative(0.6f, 0.215f, 1.125f, 0.59f, 1.522f, 1.072f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.039f, -0.742f)
                lineToRelative(-0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.854f, 0.377f)
                moveTo(14.5f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
