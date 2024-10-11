package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GithubFill: ImageVector
    get() {
        if (_githubFill != null) {
            return _githubFill!!
        }
        _githubFill = Builder(name = "GithubFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(6.476f, 2.0f, 2.001f, 6.475f, 2.001f, 12.0f)
                curveTo(2.001f, 16.425f, 4.863f, 20.163f, 8.838f, 21.487f)
                curveTo(9.338f, 21.575f, 9.526f, 21.275f, 9.526f, 21.013f)
                curveTo(9.526f, 20.775f, 9.513f, 19.987f, 9.513f, 19.15f)
                curveTo(7.001f, 19.612f, 6.351f, 18.538f, 6.151f, 17.975f)
                curveTo(6.038f, 17.688f, 5.551f, 16.8f, 5.126f, 16.563f)
                curveTo(4.776f, 16.375f, 4.276f, 15.913f, 5.113f, 15.9f)
                curveTo(5.901f, 15.887f, 6.463f, 16.625f, 6.651f, 16.925f)
                curveTo(7.551f, 18.438f, 8.988f, 18.013f, 9.563f, 17.75f)
                curveTo(9.651f, 17.1f, 9.913f, 16.663f, 10.201f, 16.413f)
                curveTo(7.976f, 16.163f, 5.651f, 15.3f, 5.651f, 11.475f)
                curveTo(5.651f, 10.387f, 6.038f, 9.488f, 6.676f, 8.788f)
                curveTo(6.576f, 8.538f, 6.226f, 7.512f, 6.776f, 6.137f)
                curveTo(6.776f, 6.137f, 7.613f, 5.875f, 9.526f, 7.162f)
                curveTo(10.326f, 6.938f, 11.176f, 6.825f, 12.026f, 6.825f)
                curveTo(12.876f, 6.825f, 13.726f, 6.938f, 14.526f, 7.162f)
                curveTo(16.438f, 5.863f, 17.276f, 6.137f, 17.276f, 6.137f)
                curveTo(17.826f, 7.512f, 17.476f, 8.538f, 17.376f, 8.788f)
                curveTo(18.014f, 9.488f, 18.401f, 10.375f, 18.401f, 11.475f)
                curveTo(18.401f, 15.313f, 16.063f, 16.163f, 13.839f, 16.413f)
                curveTo(14.201f, 16.725f, 14.514f, 17.325f, 14.514f, 18.263f)
                curveTo(14.514f, 19.6f, 14.501f, 20.675f, 14.501f, 21.013f)
                curveTo(14.501f, 21.275f, 14.689f, 21.587f, 15.189f, 21.487f)
                curveTo(19.259f, 20.113f, 22.0f, 16.296f, 22.001f, 12.0f)
                curveTo(22.001f, 6.475f, 17.526f, 2.0f, 12.001f, 2.0f)
                close()
            }
        }
        .build()
        return _githubFill!!
    }

private var _githubFill: ImageVector? = null
