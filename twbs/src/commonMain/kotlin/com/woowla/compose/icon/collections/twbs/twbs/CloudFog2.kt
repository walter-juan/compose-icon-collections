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

public val Twbs.CloudFog2: ImageVector
    get() {
        if (_cloudFog2 != null) {
            return _cloudFog2!!
        }
        _cloudFog2 = Builder(name = "CloudFog2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 2.745f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.949f, -0.313f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, true, 9.654f, 0.595f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 13.0f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.001f, -4.0f)
                horizontalLineToRelative(-0.026f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.445f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.5f, 4.0f)
                moveTo(0.0f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 8.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
        }
        .build()
        return _cloudFog2!!
    }

private var _cloudFog2: ImageVector? = null
