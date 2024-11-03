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

public val Twbs.Box2HeartFill: ImageVector
    get() {
        if (_box2HeartFill != null) {
            return _box2HeartFill!!
        }
        _box2HeartFill = Builder(name = "Box2HeartFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.4f)
                lineTo(0.1f, 4.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.1f, 0.3f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.1f, -0.3f)
                lineTo(13.05f, 0.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, -0.4f)
                close()
                moveTo(8.5f, 4.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(0.5f, 0.667f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-0.333f)
                lineTo(1.5f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 7.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0.0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0.0f, -5.132f)
            }
        }
        .build()
        return _box2HeartFill!!
    }

private var _box2HeartFill: ImageVector? = null
