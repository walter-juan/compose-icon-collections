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

public val Twbs.Box2Heart: ImageVector
    get() {
        if (_box2Heart != null) {
            return _box2Heart!!
        }
        _box2Heart = Builder(name = "Box2Heart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.982f)
                curveTo(9.664f, 6.309f, 13.825f, 9.236f, 8.0f, 13.0f)
                curveTo(2.175f, 9.236f, 6.336f, 6.31f, 8.0f, 7.982f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.4f)
                lineTo(0.1f, 4.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.1f, 0.3f)
                lineTo(0.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(16.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.1f, -0.3f)
                lineTo(13.05f, 0.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, -0.4f)
                close()
                moveTo(3.75f, 1.0f)
                lineTo(7.5f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(8.5f, 4.0f)
                lineTo(8.5f, 1.0f)
                horizontalLineToRelative(3.75f)
                lineToRelative(2.25f, 3.0f)
                close()
                moveTo(15.0f, 5.0f)
                verticalLineToRelative(10.0f)
                lineTo(1.0f, 15.0f)
                lineTo(1.0f, 5.0f)
                close()
            }
        }
        .build()
        return _box2Heart!!
    }

private var _box2Heart: ImageVector? = null
