package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Lottiefiles: ImageVector
    get() {
        if (_lottiefiles != null) {
            return _lottiefiles!!
        }
        _lottiefiles = Builder(name = "Lottiefiles", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.928f, 0.0f)
                horizontalLineTo(6.072f)
                arcTo(6.076f, 6.076f, 0.0f, false, false, 0.0f, 6.073f)
                verticalLineToRelative(11.854f)
                arcTo(6.076f, 6.076f, 0.0f, false, false, 6.073f, 24.0f)
                horizontalLineToRelative(11.854f)
                arcTo(6.076f, 6.076f, 0.0f, false, false, 24.0f, 17.927f)
                verticalLineTo(6.073f)
                arcTo(6.076f, 6.076f, 0.0f, false, false, 17.927f, 0.0f)
                moveToRelative(1.42f, 7.013f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.26f, 0.39f)
                curveToRelative(-0.11f, 0.11f, -0.24f, 0.2f, -0.39f, 0.26f)
                curveToRelative(-0.14f, 0.06f, -0.3f, 0.09f, -0.45f, 0.09f)
                curveToRelative(-2.511f, 0.0f, -3.482f, 1.53f, -4.792f, 4.042f)
                lineToRelative(-0.8f, 1.51f)
                curveToRelative(-1.231f, 2.382f, -2.762f, 5.323f, -6.894f, 5.323f)
                curveToRelative(-0.31f, 0.0f, -0.62f, -0.12f, -0.84f, -0.35f)
                arcToRelative(1.188f, 1.188f, 0.0f, false, true, 0.84f, -2.031f)
                curveToRelative(2.511f, 0.0f, 3.482f, -1.53f, 4.792f, -4.042f)
                lineToRelative(0.8f, -1.51f)
                curveToRelative(1.231f, -2.382f, 2.762f, -5.323f, 6.894f, -5.323f)
                quadToRelative(0.24f, 0.0f, 0.45f, 0.09f)
                curveToRelative(0.14f, 0.06f, 0.27f, 0.15f, 0.39f, 0.26f)
                curveToRelative(0.11f, 0.11f, 0.2f, 0.24f, 0.26f, 0.39f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, true, 0.0f, 0.9f)
            }
        }
        .build()
        return _lottiefiles!!
    }

private var _lottiefiles: ImageVector? = null
