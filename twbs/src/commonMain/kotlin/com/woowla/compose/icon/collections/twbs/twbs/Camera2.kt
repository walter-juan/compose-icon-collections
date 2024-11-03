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

public val Twbs.Camera2: ImageVector
    get() {
        if (_camera2 != null) {
            return _camera2!!
        }
        _camera2 = Builder(name = "Camera2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveToRelative(0.0f, -1.657f, 2.343f, -3.0f, 4.0f, -3.0f)
                verticalLineTo(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.318f, 3.0f)
                horizontalLineToRelative(2.015f)
                curveTo(15.253f, 3.0f, 16.0f, 3.746f, 16.0f, 4.667f)
                verticalLineToRelative(6.666f)
                curveToRelative(0.0f, 0.92f, -0.746f, 1.667f, -1.667f, 1.667f)
                horizontalLineToRelative(-2.015f)
                arcTo(5.97f, 5.97f, 0.0f, false, true, 9.0f, 14.0f)
                arcToRelative(5.97f, 5.97f, 0.0f, false, true, -3.318f, -1.0f)
                horizontalLineTo(1.667f)
                curveTo(0.747f, 13.0f, 0.0f, 12.254f, 0.0f, 11.333f)
                verticalLineTo(4.667f)
                curveTo(0.0f, 3.747f, 0.746f, 3.0f, 1.667f, 3.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                horizontalLineToRelative(0.682f)
                arcTo(5.97f, 5.97f, 0.0f, false, true, 9.0f, 2.0f)
                curveToRelative(1.227f, 0.0f, 2.367f, 0.368f, 3.318f, 1.0f)
                moveTo(2.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveTo(14.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 4.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
            }
        }
        .build()
        return _camera2!!
    }

private var _camera2: ImageVector? = null
