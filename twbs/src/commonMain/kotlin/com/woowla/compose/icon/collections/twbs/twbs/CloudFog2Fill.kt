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

public val Twbs.CloudFog2Fill: ImageVector
    get() {
        if (_cloudFog2Fill != null) {
            return _cloudFog2Fill!!
        }
        _cloudFog2Fill = Builder(name = "CloudFog2Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.905f, 4.027f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 13.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(1.05f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.713f, -1.0f)
                horizontalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(0.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(0.337f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.57f, -1.977f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.5f, 3.0f)
            }
        }
        .build()
        return _cloudFog2Fill!!
    }

private var _cloudFog2Fill: ImageVector? = null
