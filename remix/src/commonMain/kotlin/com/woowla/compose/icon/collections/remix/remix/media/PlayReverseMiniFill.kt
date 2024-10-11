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

public val MediaGroup.PlayReverseMiniFill: ImageVector
    get() {
        if (_playReverseMiniFill != null) {
            return _playReverseMiniFill!!
        }
        _playReverseMiniFill = Builder(name = "PlayReverseMiniFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.248f, 5.439f)
                lineTo(5.74f, 11.568f)
                curveTo(5.502f, 11.707f, 5.421f, 12.014f, 5.56f, 12.252f)
                curveTo(5.604f, 12.326f, 5.666f, 12.389f, 5.74f, 12.432f)
                lineTo(16.248f, 18.562f)
                curveTo(16.486f, 18.701f, 16.793f, 18.62f, 16.932f, 18.382f)
                curveTo(16.976f, 18.305f, 17.0f, 18.218f, 17.0f, 18.13f)
                verticalLineTo(5.871f)
                curveTo(17.0f, 5.594f, 16.776f, 5.371f, 16.5f, 5.371f)
                curveTo(16.411f, 5.371f, 16.324f, 5.394f, 16.248f, 5.439f)
                close()
            }
        }
        .build()
        return _playReverseMiniFill!!
    }

private var _playReverseMiniFill: ImageVector? = null
