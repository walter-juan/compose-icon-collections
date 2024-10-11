package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.VerifiedBadgeFill: ImageVector
    get() {
        if (_verifiedBadgeFill != null) {
            return _verifiedBadgeFill!!
        }
        _verifiedBadgeFill = Builder(name = "VerifiedBadgeFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.007f, 2.104f)
                curveTo(8.605f, 1.65f, 7.082f, 2.281f, 6.412f, 3.593f)
                lineTo(5.606f, 5.17f)
                curveTo(5.51f, 5.358f, 5.358f, 5.51f, 5.17f, 5.606f)
                lineTo(3.593f, 6.412f)
                curveTo(2.281f, 7.082f, 1.65f, 8.605f, 2.104f, 10.007f)
                lineTo(2.649f, 11.692f)
                curveTo(2.714f, 11.892f, 2.714f, 12.108f, 2.649f, 12.308f)
                lineTo(2.104f, 13.993f)
                curveTo(1.65f, 15.395f, 2.281f, 16.918f, 3.593f, 17.588f)
                lineTo(5.17f, 18.394f)
                curveTo(5.358f, 18.49f, 5.51f, 18.642f, 5.606f, 18.83f)
                lineTo(6.412f, 20.407f)
                curveTo(7.082f, 21.719f, 8.605f, 22.35f, 10.007f, 21.896f)
                lineTo(11.692f, 21.351f)
                curveTo(11.892f, 21.286f, 12.108f, 21.286f, 12.308f, 21.351f)
                lineTo(13.993f, 21.896f)
                curveTo(15.395f, 22.35f, 16.918f, 21.719f, 17.588f, 20.407f)
                lineTo(18.394f, 18.83f)
                curveTo(18.49f, 18.642f, 18.642f, 18.49f, 18.83f, 18.394f)
                lineTo(20.407f, 17.588f)
                curveTo(21.719f, 16.918f, 22.35f, 15.395f, 21.896f, 13.993f)
                lineTo(21.351f, 12.308f)
                curveTo(21.286f, 12.108f, 21.286f, 11.892f, 21.351f, 11.692f)
                lineTo(21.896f, 10.007f)
                curveTo(22.35f, 8.605f, 21.719f, 7.082f, 20.407f, 6.412f)
                lineTo(18.83f, 5.606f)
                curveTo(18.642f, 5.51f, 18.49f, 5.358f, 18.394f, 5.17f)
                lineTo(17.588f, 3.593f)
                curveTo(16.918f, 2.281f, 15.395f, 1.65f, 13.993f, 2.104f)
                lineTo(12.308f, 2.649f)
                curveTo(12.108f, 2.714f, 11.892f, 2.714f, 11.692f, 2.649f)
                lineTo(10.007f, 2.104f)
                close()
                moveTo(6.76f, 11.757f)
                lineTo(8.174f, 10.343f)
                lineTo(11.002f, 13.172f)
                lineTo(16.659f, 7.515f)
                lineTo(18.073f, 8.929f)
                lineTo(11.002f, 16.0f)
                lineTo(6.76f, 11.757f)
                close()
            }
        }
        .build()
        return _verifiedBadgeFill!!
    }

private var _verifiedBadgeFill: ImageVector? = null
