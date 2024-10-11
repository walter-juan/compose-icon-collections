package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.PlayMiniLine: ImageVector
    get() {
        if (_playMiniLine != null) {
            return _playMiniLine!!
        }
        _playMiniLine = Builder(name = "PlayMiniLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.482f)
                verticalLineTo(15.518f)
                lineTo(15.031f, 12.0f)
                lineTo(9.0f, 8.482f)
                close()
                moveTo(7.752f, 5.439f)
                lineTo(18.26f, 11.568f)
                curveTo(18.498f, 11.707f, 18.579f, 12.014f, 18.44f, 12.252f)
                curveTo(18.396f, 12.326f, 18.334f, 12.389f, 18.26f, 12.432f)
                lineTo(7.752f, 18.562f)
                curveTo(7.513f, 18.701f, 7.207f, 18.62f, 7.068f, 18.382f)
                curveTo(7.023f, 18.305f, 7.0f, 18.218f, 7.0f, 18.13f)
                verticalLineTo(5.871f)
                curveTo(7.0f, 5.594f, 7.224f, 5.371f, 7.5f, 5.371f)
                curveTo(7.589f, 5.371f, 7.675f, 5.394f, 7.752f, 5.439f)
                close()
            }
        }
        .build()
        return _playMiniLine!!
    }

private var _playMiniLine: ImageVector? = null
