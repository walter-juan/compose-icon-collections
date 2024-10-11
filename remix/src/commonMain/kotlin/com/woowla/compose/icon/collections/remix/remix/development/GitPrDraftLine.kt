package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.GitPrDraftLine: ImageVector
    get() {
        if (_gitPrDraftLine != null) {
            return _gitPrDraftLine!!
        }
        _gitPrDraftLine = Builder(name = "GitPrDraftLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(5.0f, 5.448f, 5.448f, 5.0f, 6.0f, 5.0f)
                curveTo(6.552f, 5.0f, 7.0f, 5.448f, 7.0f, 6.0f)
                curveTo(7.0f, 6.552f, 6.552f, 7.0f, 6.0f, 7.0f)
                curveTo(5.448f, 7.0f, 5.0f, 6.552f, 5.0f, 6.0f)
                close()
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                curveTo(3.0f, 7.306f, 3.835f, 8.417f, 5.0f, 8.829f)
                verticalLineTo(15.171f)
                curveTo(3.835f, 15.583f, 3.0f, 16.694f, 3.0f, 18.0f)
                curveTo(3.0f, 19.657f, 4.343f, 21.0f, 6.0f, 21.0f)
                curveTo(7.657f, 21.0f, 9.0f, 19.657f, 9.0f, 18.0f)
                curveTo(9.0f, 16.694f, 8.165f, 15.583f, 7.0f, 15.171f)
                verticalLineTo(8.829f)
                curveTo(8.165f, 8.417f, 9.0f, 7.306f, 9.0f, 6.0f)
                curveTo(9.0f, 4.343f, 7.657f, 3.0f, 6.0f, 3.0f)
                close()
                moveTo(5.0f, 18.0f)
                curveTo(5.0f, 17.448f, 5.448f, 17.0f, 6.0f, 17.0f)
                curveTo(6.552f, 17.0f, 7.0f, 17.448f, 7.0f, 18.0f)
                curveTo(7.0f, 18.552f, 6.552f, 19.0f, 6.0f, 19.0f)
                curveTo(5.448f, 19.0f, 5.0f, 18.552f, 5.0f, 18.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveTo(17.448f, 17.0f, 17.0f, 17.448f, 17.0f, 18.0f)
                curveTo(17.0f, 18.552f, 17.448f, 19.0f, 18.0f, 19.0f)
                curveTo(18.552f, 19.0f, 19.0f, 18.552f, 19.0f, 18.0f)
                curveTo(19.0f, 17.448f, 18.552f, 17.0f, 18.0f, 17.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(15.0f, 16.343f, 16.343f, 15.0f, 18.0f, 15.0f)
                curveTo(19.657f, 15.0f, 21.0f, 16.343f, 21.0f, 18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                curveTo(16.343f, 21.0f, 15.0f, 19.657f, 15.0f, 18.0f)
                close()
                moveTo(18.0f, 7.5f)
                curveTo(18.828f, 7.5f, 19.5f, 6.828f, 19.5f, 6.0f)
                curveTo(19.5f, 5.172f, 18.828f, 4.5f, 18.0f, 4.5f)
                curveTo(17.172f, 4.5f, 16.5f, 5.172f, 16.5f, 6.0f)
                curveTo(16.5f, 6.828f, 17.172f, 7.5f, 18.0f, 7.5f)
                close()
                moveTo(19.5f, 11.5f)
                curveTo(19.5f, 12.328f, 18.828f, 13.0f, 18.0f, 13.0f)
                curveTo(17.172f, 13.0f, 16.5f, 12.328f, 16.5f, 11.5f)
                curveTo(16.5f, 10.672f, 17.172f, 10.0f, 18.0f, 10.0f)
                curveTo(18.828f, 10.0f, 19.5f, 10.672f, 19.5f, 11.5f)
                close()
            }
        }
        .build()
        return _gitPrDraftLine!!
    }

private var _gitPrDraftLine: ImageVector? = null
